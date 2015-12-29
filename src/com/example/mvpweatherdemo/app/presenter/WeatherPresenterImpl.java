package com.example.mvpweatherdemo.app.presenter;

import com.example.mvpweatherdemo.app.model.Weather;
import com.example.mvpweatherdemo.app.model.WeatherModel;
import com.example.mvpweatherdemo.app.model.WeatherModelImpl;
import com.example.mvpweatherdemo.view.WeatherView;

public class WeatherPresenterImpl implements WeatherPresenter, OnWeatherListener {

    private WeatherView weatherView;
    private WeatherModel weatherModel;

    public WeatherPresenterImpl(WeatherView weatherView) {
        super();
        this.weatherView = weatherView;
        this.weatherModel = new WeatherModelImpl();
    }

    @Override
    public void getWeather(String cityNo) {
        weatherView.showLoading();
        weatherModel.getWeather(cityNo, this);
    }

    @Override
    public void onSuccess(Weather weather) {
        weatherView.hideLoading();
        weatherView.setWeatherInfo(weather);
    }

    @Override
    public void onError() {
        weatherView.hideLoading();
        weatherView.showError();
    }

}
