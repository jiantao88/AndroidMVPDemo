package com.example.mvpweatherdemo.junittest;

import android.test.AndroidTestCase;

import com.example.mvpweatherdemo.app.model.Weather;
import com.example.mvpweatherdemo.app.model.WeatherModelImpl;
import com.example.mvpweatherdemo.app.presenter.OnWeatherListener;

public class WeatherTest extends AndroidTestCase {
    private final String TAG = "main";

    // public WeatherTest() {
    // // super();
    // VolleyRequest.buildRequestQueue(getContext());
    // setContext(getContext());
    // }

    public void getWeather() {
        WeatherModelImpl weatherModelImpl = new WeatherModelImpl();
        weatherModelImpl.getWeather("101010100", new OnWeatherListener() {

            @Override
            public void onSuccess(Weather weather) {
            }

            @Override
            public void onError() {
            }
        });
    }
}
