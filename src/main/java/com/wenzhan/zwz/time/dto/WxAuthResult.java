package com.wenzhan.zwz.time.dto;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-08-20
 */
@Data
public class WxAuthResult {

    /**
     * openid
     */
    private String openid;

    /**
     * 会话秘钥
     */
    private String sessionKey;

    /**
     * 用户在开放平台的唯一标识符，在满足 UnionID 下发条件的情况下会返回
     */
    private String unionid;

    /**
     * 错误码
     */
    private String errcode;

    /**
     * 错误信息
     */
    private String errmsg;
}
