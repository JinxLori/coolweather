package com.example.wsh666.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wsh666 on 2018/3/15.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getId() {
        return id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
