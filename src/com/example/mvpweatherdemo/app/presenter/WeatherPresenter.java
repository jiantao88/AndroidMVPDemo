package com.example.mvpweatherdemo.app.presenter;

/**
 * Presenter层的接口 用户获取天气信息
 * 
 * @author ZhangJianTao
 * @since 2015-4-14
 */
public interface WeatherPresenter {
    void getWeather(String cityNo);
}
