package com.wenzhan.zwz.time.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengwenzhan on 2019-08-18
 */
@Data
public class ResultModel<T> implements Serializable {
    private static final long serialVersionUID = -4592401232832840258L;
    /**
     * 执行结果
     */
    private T result;

    /**
     * 调用是否成功
     */
    private boolean isSuccess;

    /**
     * 执行结果描述
     */
    private String errorMsg;

    /**
     * 错误码
     */
    private String errorCode;

    public void success(T result) {
        this.isSuccess = true;
        this.result = result;
    }

    public void fail(String message, String errorCode) {
        this.errorMsg = message;
        this.isSuccess = false;
        this.errorCode = errorCode;
    }
}
