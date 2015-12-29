package com.example.mvpweatherdemo.app;

import org.rocko.demos.mvp.util.volley.VolleyRequest;

import android.app.Application;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}
