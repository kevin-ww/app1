package com.example.kevin.app1.model.request;

/**
 * Created by kevin on 2/3/15.
 */
public class MarketingAPIRequest {

    String ak;          //app key
    String k;           // adKey 广告位key

    String av;          //app version       1.0.0
    String sv;          //sdk version       2.0



    String u;       //sign in user
    //String lat;      //latitude         "-33.8669710"
    //String lng;      //longitude        "151.1958750"

    String fp;      //fingerprint
    String d;       //device id
    String os;      //os
    String t;       //device type ,             0:phone ,1:pad ,2:?
    String sr;      //screen resolution         "1920 × 1080“
}
