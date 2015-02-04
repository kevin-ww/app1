package com.kvn.mw.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;

import java.io.UnsupportedEncodingException;

/**
 * Created by 310095504 on 2/4/2015.
 */
public class ApiRequest<RequestParams,T> extends JsonRequest<T> {

    //use POST
    //use fastJson;
    //use default error listener;?
    public ApiRequest(String url, RequestParams req, Response.Listener<T> listener) {
        this(url, req, listener, createDefaultErrorListener());
    }

    public ApiRequest(String url, RequestParams req, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(Method.POST, url, JSON.toJSONString(req), listener, errorListener);
    }

    protected static Response.ErrorListener createDefaultErrorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e(error.toString(), "error occurred!");
            }
        };
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {

        String jsonString = null;
        ApiResponseData apiResponseData = null;
        T data = null;

        int status=0;

        try {
            jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            apiResponseData = (ApiResponseData) JSON.parseObject(jsonString, ApiResponseData.class);
            data = (T)apiResponseData.getData();
            status=apiResponseData.getStatus();
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (Exception e) {
            return Response.error(new ParseError(e));
        }

        if(status==0){
            return Response.success(data,
                    HttpHeaderParser.parseCacheHeaders(response));
        } else{
            return Response.error(new VolleyError(apiResponseData.getMsg()));
        }





    }
}
