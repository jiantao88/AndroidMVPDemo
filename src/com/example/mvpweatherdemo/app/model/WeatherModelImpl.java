package com.example.mvpweatherdemo.app.model;

import org.rocko.demos.mvp.util.volley.VolleyRequest;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.mvpweatherdemo.app.presenter.OnWeatherListener;

/**
 * Model 层数据的实现 也可以放在Presenter层中
 * 
 * @author ZhangJianTao
 * @since 2015-4-14
 */
public class WeatherModelImpl implements WeatherModel {

    @Override
    public void getWeather(String cityNo, final OnWeatherListener onWeatherListener) {
        VolleyRequest.newInstance().newGsonRequest(
                "http://www.weather.com.cn/data/sk/" + cityNo + ".html", Weather.class, new Response.Listener<Weather>() {
                    @Override
                    public void onResponse(Weather weather) {
                        if (weather != null) {
                            onWeatherListener.onSuccess(weather);
                            System.out.println("---" + weather.getWeatherinfo().toString());
                        } else {
                            onWeatherListener.onError();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError arg0) {
                        onWeatherListener.onError();
                    }
                });
    }

}
