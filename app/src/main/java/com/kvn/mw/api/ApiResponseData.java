package com.kvn.mw.api;

/**
 * Created by 310095504 on 2/4/2015.
 */
public class ApiResponseData<T> {

    int status = 0;         //status    code , 0:success;1:fail
    T data;             //response data
    String msg;              //if failed, error message will return

//    public ApiResponseData(int status, T data, String msg) {
//        this.status = status;
//        this.data = data;
//        this.msg = msg;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

//    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }
}
