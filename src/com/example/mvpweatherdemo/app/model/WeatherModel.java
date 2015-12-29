package com.example.mvpweatherdemo.app.model;

import com.example.mvpweatherdemo.app.presenter.OnWeatherListener;

/**
 * 天气接口 根据OnWeatherListener 回调数据获取状态
 * 
 * @author ZhangJianTao
 * @since 2015-4-14
 */
public interface WeatherModel {

    void getWeather(String cityNo, OnWeatherListener onWeatherListener);

}
