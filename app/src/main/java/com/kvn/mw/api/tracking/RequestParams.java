package com.kvn.mw.api.tracking;

import java.util.List;

/**
 * Created by 310095504 on 2/4/2015.
 */
public class RequestParams {

    String ak;          //app key
    String av;          //app version       1.0.0
    String sv;          //sdk version       2.0
    String u;           //sign in user

    Device d;                //device


    String lat;      //latitude
    String lng;      //longitude

    List<Event> es;         //events;

    static class Device {
        String d;      //deviceId
        String fp;      //fingerPrint
        String os;      //0(adroid) 1(iOS) 2(WP) 3(Others)
        String osv;     //osVersion
        String b;       //branding
        String m;       //model
        String mf;      //manufacturer
        String c;       //carrier
        //Unknown= 0,
        //China Mobile=1            //移动
        //China Unicom=2            //联通
        //China Telecom=3           //电信
        //China Tietong=4           //铁通
        String mac;     //mac address
        String sr;      //screenResolution
        String ts;      //tags
    }

    static class Event {
        String a;       //action
        String l;       //label
        String st;      //start time
        String et;      //end time
        String nw;      //network
        //wifi = 0
        //2G = 1
        //3G = 2
        //4G = 3

        String ts;      //tags

        //

        String ak;      //activity key;

        String p;       //page path ,url or class name;
        String t;       //page title
        String pp;      //previous path;


        String sn;      //social network,
        String sa;      //social action,share,like and so on;


    }

}
