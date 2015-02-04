package com.kvn.mw.api;

import com.android.volley.Response;
import com.kvn.mw.api.configuration.RequestParams;
import com.kvn.mw.api.configuration.ResponseData;

/**
 * Created by 310095504 on 2/4/2015.
 */
public class ApiRequestGenerator {

    public static final String CONFIGURATION_API_ENDPOINT = "http://stats.magicwindow.cn/config/v2";

    public static final String TRACKING_API_ENDPOINT = null;

    public static ApiRequest<RequestParams,ResponseData> generateConfigurationApiRequest(RequestParams requestParams, Response.Listener<ResponseData> listener) {
        return new ApiRequest<RequestParams,ResponseData>(CONFIGURATION_API_ENDPOINT, requestParams, listener);
    }

    public ApiRequest<com.kvn.mw.api.tracking.RequestParams,String> generateTrackingApiRequest() {
        return null;
    }

}
