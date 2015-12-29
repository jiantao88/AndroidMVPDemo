package com.example.mvpweatherdemo.app.presenter;

import com.example.mvpweatherdemo.app.model.Weather;

/**
 * 在Presenter层实现，Model通过此接口回调Presenter 在通过Presenter层回调VIew层，确保Model层部直接操作View层
 * 
 * @author ZhangJianTao
 * @since 2015-4-14
 */
public interface OnWeatherListener {

    void onSuccess(Weather weather);

    void onError();
}
