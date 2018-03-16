package com.example.wsh666.coolweather.gson;

/**
 * Created by wsh666 on 2018/3/16.
 */
//空气质量情况
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
