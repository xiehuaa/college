package com.xh.common;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-05-26
 */
public enum SystemErrorCodeEnum {
    SYSTEM_ERROR(10000, "系统错误");
    
    private Integer code;
    private String msg;

    SystemErrorCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
