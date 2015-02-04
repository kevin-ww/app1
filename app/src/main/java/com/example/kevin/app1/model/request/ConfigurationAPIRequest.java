package com.example.kevin.app1.model.request;

import android.content.res.Configuration;

import com.alibaba.fastjson.JSON;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import com.example.kevin.app1.model.APIResponse;
import com.example.kevin.app1.model.ConfigurationBO;

/**
 * Created by kevin on 2/3/15.
 */
public class ConfigurationAPIRequest extends BaseAPIRequest<ConfigurationBO>{

    public static final String DEFAULT_CONFIGURATION_API_ENDPOINT = "";

    public static final ConfigurationBO DEFAULT_CONFIGURATION_BO = null;


    public ConfigurationAPIRequest(ConfigurationBO requestJson) {
        super(DEFAULT_CONFIGURATION_API_ENDPOINT, requestJson, new ConfigurationAPIResponseListener());
    }


    public ConfigurationAPIRequest(ConfigurationBO requestJson, Response.Listener<APIResponse> listener) {
        super(DEFAULT_CONFIGURATION_API_ENDPOINT, requestJson, listener);
    }

    public ConfigurationAPIRequest(String url, ConfigurationBO requestJson, Response.Listener<APIResponse> listener) {
        super(url, requestJson, listener);
    }


    static class ConfigurationAPIResponseListener implements Response.Listener<APIResponse> {

        @Override
        public void onResponse(APIResponse response) {
            //
            System.out.println(response);

        }
    }


//    public ConfigurationAPIRequest(ConfigurationBO postData, Response.Listener<APIResponse> listener) {
//        super(DEFAULT_CONFIGURATION_API_ENDPOINT, JSON.toJSONString(postData), listener);
//    }


//    public ConfigurationAPIRequest(String url, String requestBody, Response.Listener<APIResponse> listener) {
//        super(url, requestBody, listener);
//    }

//    public ConfigurationAPIRequest(ConfigurationBO configurationBO, Response.Listener<ConfigurationBO> listener, Response.ErrorListener errorListener) {
//        super(Method.POST, DEFAULT_CONFIGURATION_API_ENDPOINT, (configurationBO == null) ? null : configurationBO.toJsonString(), listener, errorListener);
//    }
//
////    public ConfigurationAPIRequest(int method, String url, String requestBody, Response.Listener<ConfigurationBO> listener, Response.ErrorListener errorListener) {
////        super(method, url, requestBody, listener, errorListener);
////    }
//
//    @Override
//    protected Response<ConfigurationBO> parseNetworkResponse(NetworkResponse response) {
////
////        int status = 0;     //status    code , 0:success;1:fail
////        Object data;    //response data
////        String msg;     //if failed, error message will return
//        return null;
//    }
}
