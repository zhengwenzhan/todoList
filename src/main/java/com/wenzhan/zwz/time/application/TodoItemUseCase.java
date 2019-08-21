package com.wenzhan.zwz.time.application;

import com.github.dozermapper.core.Mapper;
import com.wenzhan.zwz.time.domain.model.TodoItem;
import com.wenzhan.zwz.time.domain.repository.TodoItemRepository;
import com.wenzhan.zwz.time.dto.TodoItemDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengwenzhan on 2019-08-14
 */
@Component
public class TodoItemUseCase {
    @Resource
    private TodoItemRepository todoItemRepository;

    @Resource
    private Mapper mapper;

    public void save(TodoItemDTO todoItemDTO) {
        TodoItem todoItem = mapper.map(todoItemDTO, TodoItem.class);
        todoItem.setVersion(0);
        todoItem.setIsDeleted(0);
        todoItemRepository.save(todoItem);
    }

    public TodoItemDTO get(Integer id) {
        TodoItem todoItem = todoItemRepository.get(id);
        return mapper.map(todoItem, TodoItemDTO.class);
    }

    public List<TodoItemDTO> query(String openId) {
        List<TodoItem> todoItems = todoItemRepository.query(openId);
        List<TodoItemDTO> todoItemDTOS = new ArrayList<>();

        for (TodoItem todoItem : todoItems) {
            todoItemDTOS.add(mapper.map(todoItem, TodoItemDTO.class));
        }

        return todoItemDTOS;

    }

    public void update(TodoItemDTO todoItemDTO) {
        TodoItem oldTodoItem = todoItemRepository.get(todoItemDTO.getId());
        TodoItem todoItem = mapper.map(todoItemDTO, TodoItem.class);
        todoItem.setVersion(oldTodoItem.getVersion() + 1);
        todoItem.setIsDeleted(0);
        todoItemRepository.update(todoItem);
    }

    public void delete(Integer id) {
        todoItemRepository.delete(id);
    }
}
