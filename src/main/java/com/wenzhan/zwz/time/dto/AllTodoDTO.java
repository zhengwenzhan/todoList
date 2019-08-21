package com.wenzhan.zwz.time.dto;


import lombok.Data;

import java.util.List;

/**
 * Created by zhengwenzhan on 2019-08-18
 */
@Data
public class AllTodoDTO {
    /**
     * 重要紧急事项
     */
    private List<TodoItemDTO> importantUrgent;

    /**
     * 重要不紧急事项
     */
    private List<TodoItemDTO> importantNotUrgent;

    /**
     * 紧急不重要事项
     */
    private List<TodoItemDTO> urgentNotImportant;

    /**
     * 不紧急不重要事项
     */
    private List<TodoItemDTO> notUrgentNotImportant;
}
