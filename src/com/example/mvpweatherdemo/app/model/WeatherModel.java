package com.example.mvpweatherdemo.app.model;

import com.example.mvpweatherdemo.app.presenter.OnWeatherListener;

/**
 * �����ӿ� ����OnWeatherListener �ص����ݻ�ȡ״̬
 * 
 * @author ZhangJianTao
 * @since 2015-4-14
 */
public interface WeatherModel {

    void getWeather(String cityNo, OnWeatherListener onWeatherListener);

}
