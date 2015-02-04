package com.kvn.mw.api.configuration;

/**
 * Created by 310095504 on 2/4/2015.
 */
public class ResponseData {

    int e;  //enable sdk or not , 0:no ,1:yes
    int ss;

    //sending data strategy


    //    int MTA_STRATEGY_INSTANT = 1;            //实时上报
    //    int MTA_STRATEGY_BATCH = 2;              //批量上报，达到缓存临界值时触发发送
    //    int MTA_STRATEGY_APP_LAUNCH = 3;         //应用启动时发送
    //    int MTA_STRATEGY_ONLY_WIFI = 4;          //仅在WIFI网络下发送
    //    int  MTA_STRATEGY_PERIOD = 5;             //每间隔一定最小时间发送，默认24小时
    //    int MTA_STRATEGY_DEVELOPER = 6;           //开发者在代码中主动调用发送行为
    //    int  MTA_STRATEGY_ONLY_WIFI_NO_CACHE = 7;  //仅在WIFI网络下发送; 发送失败以及非WIFI网络情况下不缓存数据


    //color and many other stuff;


    int lbs;    //enable lbs or not, 0:no ,1 :yes

    Style sy;   //pre-configured style

    static class Style {

        String nv; //navigation bar     "nav.bar":"255,255,255,0.4" or "#80BFFF"
        String fc;  // font color
        String fcp; // font color,when pressed
        String ly;  // background color of ***layer
        //    String pp;  // popup window
        String bg;  // background color of share window
        String sh;  // share tool-kit;   0,1,2,3
    }

    public int getE() {
        return e;
    }

    public int getSs() {
        return ss;
    }

    public int getLbs() {
        return lbs;
    }

    public Style getSy() {
        return sy;
    }
}
