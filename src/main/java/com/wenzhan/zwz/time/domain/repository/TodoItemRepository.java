package com.wenzhan.zwz.time.domain.repository;

import com.wenzhan.zwz.time.domain.model.TodoItem;

import java.util.List;

/**
 * Created by zhengwenzhan on 2019-08-13
 */
public interface TodoItemRepository {
    /**
     * 添加保存事项
     *
     * @param todoItem
     */
    public void save(TodoItem todoItem);

    /**
     * 获取某个事项id
     *
     * @param id
     * @return
     */
    public TodoItem get(Integer id);

    /**
     * 根据openid查询所有事项
     *
     * @param openId
     * @return
     */
    public List<TodoItem> query(String openId);

    /**
     * 更新事项
     *
     * @param todoItem
     */
    public void update(TodoItem todoItem);

    /**
     * 删除事项
     *
     * @param id
     */
    public void delete(Integer id);
}
