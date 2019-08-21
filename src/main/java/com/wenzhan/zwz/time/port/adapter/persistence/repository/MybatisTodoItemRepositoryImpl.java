package com.wenzhan.zwz.time.port.adapter.persistence.repository;

import com.github.dozermapper.core.Mapper;
import com.wenzhan.zwz.time.domain.model.TodoItem;
import com.wenzhan.zwz.time.domain.repository.TodoItemRepository;
import com.wenzhan.zwz.time.port.adapter.persistence.dataobject.TodoItemDO;
import com.wenzhan.zwz.time.port.adapter.persistence.dataobject.TodoItemDOExample;
import com.wenzhan.zwz.time.port.adapter.persistence.mapper.TodoItemDOMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengwenzhan on 2019-08-13
 */
@Repository
public class MybatisTodoItemRepositoryImpl implements TodoItemRepository {

    @Resource
    private Mapper mapper;

    @Resource
    private TodoItemDOMapper todoItemDOMapper;

    @Override
    public void save(TodoItem todoItem) {
        TodoItemDO todoItemDO = mapper.map(todoItem, TodoItemDO.class);

        Date now = new Date();
        todoItemDO.setGmtCreate(now);
        todoItemDO.setGmtModified(now);

        int result = todoItemDOMapper.insert(todoItemDO);

        if (result <= 0) {
            throw new RuntimeException("插入失败");
        }
    }

    @Override
    public TodoItem get(Integer id) {
        TodoItemDO todoItemDO = todoItemDOMapper.selectByPrimaryKey(id);
        return mapper.map(todoItemDO, TodoItem.class);
    }

    @Override
    public List<TodoItem> query(String openId) {
        TodoItemDOExample example = new TodoItemDOExample();
        example.createCriteria().andOpenIdEqualTo(openId);

        List<TodoItemDO> todoItemDOS = todoItemDOMapper.selectByExample(example);

        List<TodoItem> todoItems = new ArrayList<>();

        for (TodoItemDO todoItemDO : todoItemDOS) {
            todoItems.add(mapper.map(todoItemDO, TodoItem.class));
        }

        return todoItems;
    }

    @Override
    public void update(TodoItem todoItem) {
        TodoItemDO todoItemDO = mapper.map(todoItem, TodoItemDO.class);
        todoItemDO.setGmtModified(new Date());
        todoItemDOMapper.updateByPrimaryKeySelective(todoItemDO);
    }

    @Override
    public void delete(Integer id) {
        todoItemDOMapper.deleteByPrimaryKey(id);
    }
}
