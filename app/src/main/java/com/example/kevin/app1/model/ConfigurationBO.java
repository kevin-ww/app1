package com.example.kevin.app1.model;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by kevin on 2/3/15.
 */
public class ConfigurationBO {

    private String ak;          // appKey;

    private String av;          //app version       1.0.0

    private String sv;          //sdk version       2.0

    private String pn ;          //String packageName;

    public ConfigurationBO(String ak, String av, String sv, String pn) {
        this.ak = ak;
        this.av = av;
        this.sv = sv;
        this.pn = pn;
    }
//    public String toJsonString(){
//        //
//        return null;
//    }

}
