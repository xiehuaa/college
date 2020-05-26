package com.xh.common.result;

import com.xh.common.BaseSerializable;

import java.util.List;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-05-24
 */
public class PageResult<T> extends BaseSerializable {
    private static final int DEFAULT_SUCCESS_CODE = 0;
    public static final Integer SUCCESS = DEFAULT_SUCCESS_CODE;

    private static final String DEFAULT_SUCCESS_MSG = "请求成功";

    private Integer pageNum;
    private Integer pageSize;
    private Integer pages;
    private Integer total;
    private Integer code;
    private String msg;
    private List<T> data;

    public PageResult<T> success(List<T> data) {
        this.code = DEFAULT_SUCCESS_CODE;
        this.msg = DEFAULT_SUCCESS_MSG;
        this.data = data;

        return this;
    }

    public PageResult<T> fail(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;

        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
