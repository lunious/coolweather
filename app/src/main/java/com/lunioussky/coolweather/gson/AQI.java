package com.lunioussky.coolweather.gson;

/**
 * Created by lunioussky on 2017/5/23.
 */

public class AQI {
    public AQICity aqiCity;

    public class AQICity {
        public String api;
        public String pm25;
    }
}
