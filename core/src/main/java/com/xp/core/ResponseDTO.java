package com.xp.core;

import lombok.Data;

import java.io.Serializable;


public class ResponseDTO<T> implements Serializable {

    private String code;

    private String msg;

    private  T  data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    public ResponseDTO(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseDTO() {
        this.code="200";
        this.msg="操作成功";
        this.data=null;
    }
}
