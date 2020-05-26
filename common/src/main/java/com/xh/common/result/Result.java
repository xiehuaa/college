package com.xh.common.result;

import com.xh.common.BaseSerializable;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-05-24
 */
public class Result<T> extends BaseSerializable {
    private static final int DEFAULT_SUCCESS_CODE = 0;
    public static final Integer SUCCESS = DEFAULT_SUCCESS_CODE;
    private static final String DEFAULT_SUCCESS_MSG = "请求成功";
    private Integer code;

    private String msg;

    private T data;

    public Result<T> success(T data) {
        this.code = DEFAULT_SUCCESS_CODE;
        this.msg = DEFAULT_SUCCESS_MSG;
        this.data = data;

        return this;
    }

    public Result<T> fail(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;

        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
