package com.wenzhan.zwz.time.domain.model;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-08-13
 */
@Data
public class TodoItem extends BaseDomainEntity {

    /**
     * 事项类型，重要紧急、重要不紧急、紧急不重要、不重要不紧急
     */
    private String type;

    /**
     * 事项内容
     */
    private String content;

    /**
     * 事项标题
     */
    private String title;

    /**
     * 用户唯一标识id
     */
    private String openId;
}
