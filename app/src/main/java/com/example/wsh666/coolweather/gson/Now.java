package com.example.wsh666.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wsh666 on 2018/3/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temprature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
