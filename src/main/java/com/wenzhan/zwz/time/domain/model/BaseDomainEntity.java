package com.wenzhan.zwz.time.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengwenzhan on 2019-08-13
 */
@Data
public class BaseDomainEntity implements Serializable {
    private static final long serialVersionUID = -8697452318757850821L;

    /**
     * 数据库主键id
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 是否删除
     */
    private Integer isDeleted;
}
