package com.kvn.mw.api.configuration;

/**
 * Created by 310095504 on 2/4/2015.
 */
public class RequestParams {

    String ak;          // appKey;

    String av;          //app version       1.0.0

    String sv;          //sdk version       2.0

    String pn;          //        String packageName;

    public RequestParams(){

    }

    public RequestParams(String ak, String av, String sv, String pn) {
        this.ak = ak;
        this.av = av;
        this.sv = sv;
        this.pn = pn;
    }

    public RequestParams setAk(String ak) {
        this.ak = ak;
        return this;
    }

    public RequestParams setAv(String av) {
        this.av = av;
        return this;
    }

    public RequestParams setSv(String sv) {
        this.sv = sv;
        return this;
    }

    public RequestParams setPn(String pn) {
        this.pn = pn;
        return this;
    }

    public RequestParams createRequestParams() {
        return new RequestParams(ak, av, sv, pn);
    }
}
