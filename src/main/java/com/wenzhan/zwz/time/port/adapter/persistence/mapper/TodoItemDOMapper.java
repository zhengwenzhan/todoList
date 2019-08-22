package com.wenzhan.zwz.time.port.adapter.persistence.mapper;

import com.wenzhan.zwz.time.port.adapter.persistence.dataobject.TodoItemDO;
import com.wenzhan.zwz.time.port.adapter.persistence.dataobject.TodoItemDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TodoItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    long countByExample(TodoItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int deleteByExample(TodoItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int insert(TodoItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int insertSelective(TodoItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    List<TodoItemDO> selectByExample(TodoItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    TodoItemDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") TodoItemDO record, @Param("example") TodoItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int updateByExample(@Param("record") TodoItemDO record, @Param("example") TodoItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int updateByPrimaryKeySelective(TodoItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_item
     *
     * @mbg.generated Thu Aug 22 19:15:10 CST 2019
     */
    int updateByPrimaryKey(TodoItemDO record);
}