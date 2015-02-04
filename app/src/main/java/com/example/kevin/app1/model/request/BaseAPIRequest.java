package com.example.kevin.app1.model.request;


import com.alibaba.fastjson.JSON;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import com.example.kevin.app1.model.APIResponse;


/**
 * Created by kevin on 2/3/15.
 */
public class BaseAPIRequest<T> extends JsonRequest<APIResponse> {

    public BaseAPIRequest( String url, T requestJson, Response.Listener<APIResponse> listener) {
        super(Method.POST, url, JSON.toJSONString(requestJson), listener, getDefaultErrorListener());
    }

//
//    public BaseAPIRequest( String url, String requestBody, Response.Listener<APIResponse> listener) {
//        super(Method.POST, url, requestBody, listener, getDefaultErrorListener());
//    }
//
//
//    public BaseAPIRequest( String url, String requestBody, Response.Listener<APIResponse> listener, Response.ErrorListener errorListener) {
//        super(Method.POST, url, requestBody, listener, errorListener);
//    }
//
//    public BaseAPIRequest(int method, String url, String requestBody, Response.Listener<APIResponse> listener, Response.ErrorListener errorListener) {
//        super(method, url, requestBody, listener, errorListener);
//    }

    @Override
    protected Response<APIResponse> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    protected static Response.ErrorListener getDefaultErrorListener(){
        return null;
    }


//    public BaseAPIRequest(String url, JSONObject requestObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
//        //use post as default;
//        super(Method.POST, url, (requestObject == null) ? null : requestObject.toString(), listener, errorListener);
//    }


//    public BaseAPIRequest(int method, String url, String requestBody, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
//        super(method, url, requestBody, listener, errorListener);
//    }

//    @Override
//    protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
//        return null;
//    }
}
