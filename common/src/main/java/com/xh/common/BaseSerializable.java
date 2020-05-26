package com.xh.common;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-05-24
 */
public class BaseSerializable implements Serializable {
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
