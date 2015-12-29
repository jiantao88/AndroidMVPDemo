package com.example.mvpweatherdemo.view;

import com.example.mvpweatherdemo.app.model.Weather;

/**
 * View层的实现接口
 * 
 * @author ZhangJianTao
 * @since 2015-4-14
 */
public interface WeatherView {
    void showLoading();

    void hideLoading();

    void showError();

    void setWeatherInfo(Weather weather);
}
