package com.wenzhan.zwz.time.domain.model;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-08-20
 */
@Data
public class User extends BaseDomainEntity{

    /**
     * openid
     */
    private String openId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户电话
     */
    private String telPhone;


}
