package com.wenzhan.zwz.time.port.adapter.http;

import com.wenzhan.zwz.time.application.TodoItemUseCase;
import com.wenzhan.zwz.time.dto.AllTodoDTO;
import com.wenzhan.zwz.time.dto.ResultModel;
import com.wenzhan.zwz.time.dto.TodoItemDTO;
import com.wenzhan.zwz.time.port.adapter.redis.RedisCache;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengwenzhan on 2019-08-14
 */
@Controller
@ResponseBody
public class TodoItemController {
    @Resource
    private TodoItemUseCase todoItemUseCase;

    @Resource
    private RedisCache redisCache;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResultModel<Boolean> save(@RequestBody TodoItemDTO todoItemDTO) {
        ResultModel<Boolean> rm = new ResultModel<>();
        try {
            todoItemUseCase.save(todoItemDTO);
            rm.success(true);
        } catch (Exception e) {
            rm.fail(e.getMessage(), "SAVE_TODO_ERROR");
        }
        return rm;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResultModel<TodoItemDTO> get(@RequestParam Integer id) {
        ResultModel<TodoItemDTO> rm = new ResultModel<>();
        try {
            TodoItemDTO todoItemDTO = todoItemUseCase.get(id);
            rm.success(todoItemDTO);
        } catch (Exception e) {
            rm.fail(e.getMessage(), "GET_TODO_ERROR");
        }
        return rm;
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResultModel<AllTodoDTO> query(@RequestParam String sessionKey) {
        ResultModel<AllTodoDTO> rm = new ResultModel<>();
        String session = redisCache.get(sessionKey);

        if (StringUtils.isEmpty(session)) {
            return rm;
        }

        String[] strings = session.split("_");
        List<TodoItemDTO> todoItemDTOS = todoItemUseCase.query(strings[1]);
        AllTodoDTO allTodoDTO = new AllTodoDTO();

        dealQueryResult(allTodoDTO, todoItemDTOS);
        rm.success(allTodoDTO);
        return rm;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultModel<Boolean> update(@RequestBody TodoItemDTO todoItemDTO) {
        ResultModel<Boolean> rm = new ResultModel<>();
        rm.success(true);
        todoItemUseCase.update(todoItemDTO);
        return rm;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResultModel<Boolean> delete(@RequestBody Integer id) {
        ResultModel<Boolean> rm = new ResultModel<>();
        rm.success(true);
        todoItemUseCase.delete(id);
        return rm;
    }

    private void dealQueryResult(AllTodoDTO allTodoDTO, List<TodoItemDTO> todoItemDTOS) {
        List<TodoItemDTO> importantUrgent = new ArrayList<>();
        List<TodoItemDTO> importantNotUrgent = new ArrayList<>();
        List<TodoItemDTO> urgentNotImportant = new ArrayList<>();
        List<TodoItemDTO> notUrgentNotImportant = new ArrayList<>();

        for (TodoItemDTO todoItemDTO : todoItemDTOS) {
            switch (todoItemDTO.getType()) {
                case "importantUrgent":
                    importantUrgent.add(todoItemDTO);
                    break;
                case "importantNotUrgent":
                    importantNotUrgent.add(todoItemDTO);
                    break;
                case "urgentNotImportant":
                    urgentNotImportant.add(todoItemDTO);
                    break;
                case "notUrgentNotImportant":
                    notUrgentNotImportant.add(todoItemDTO);
                    break;
                default:
                    break;
            }
        }
        allTodoDTO.setImportantNotUrgent(importantNotUrgent);
        allTodoDTO.setImportantUrgent(importantUrgent);
        allTodoDTO.setUrgentNotImportant(urgentNotImportant);
        allTodoDTO.setNotUrgentNotImportant(notUrgentNotImportant);

    }
}
