package com.example.mvpweatherdemo.app.presenter;

import com.example.mvpweatherdemo.app.model.Weather;

/**
 * ��Presenter��ʵ�֣�Modelͨ���˽ӿڻص�Presenter ��ͨ��Presenter��ص�VIew�㣬ȷ��Model�㲿ֱ�Ӳ���View��
 * 
 * @author ZhangJianTao
 * @since 2015-4-14
 */
public interface OnWeatherListener {

    void onSuccess(Weather weather);

    void onError();
}
