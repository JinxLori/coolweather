package com.example.wsh666.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wsh666 on 2018/3/16.
 */


//未来很多天的预报显示 这里只代表未来每一天的天气信息，然后在Weather中用集合来声明
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
