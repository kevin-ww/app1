package com.example.kevin.app1.model;

/**
 * Created by kevin on 2/3/15.
 */
public class APIResponse {

    int status = 0;     //status    code , 0:success;1:fail
    Object data;    //response data
    String msg;     //if failed, error message will return
}
