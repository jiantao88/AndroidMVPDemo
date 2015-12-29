package com.example.mvpweatherdemo.view;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpweatherdemo.R;
import com.example.mvpweatherdemo.app.model.Weather;
import com.example.mvpweatherdemo.app.model.WeatherInfo;
import com.example.mvpweatherdemo.app.presenter.WeatherPresenter;
import com.example.mvpweatherdemo.app.presenter.WeatherPresenterImpl;

public class MainActivity extends Activity implements OnClickListener, WeatherView {
    private Dialog loadingDialog;
    private EditText cityNOInput;
    private TextView city;
    private TextView cityNO;
    private TextView temp;
    private TextView wd;
    private TextView ws;
    private TextView sd;
    private TextView wse;
    private TextView time;
    private TextView njd;

    private WeatherPresenter weatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        cityNOInput = (EditText) findViewById(R.id.et_city_no);
        city = (TextView) findViewById(R.id.tv_city);
        cityNO = (TextView) findViewById(R.id.tv_city_no);
        temp = (TextView) findViewById(R.id.tv_temp);
        wd = (TextView) findViewById(R.id.tv_WD);
        ws = (TextView) findViewById(R.id.tv_WS);
        sd = (TextView) findViewById(R.id.tv_SD);
        wse = (TextView) findViewById(R.id.tv_WSE);
        time = (TextView) findViewById(R.id.tv_time);
        njd = (TextView) findViewById(R.id.tv_njd);

        findViewById(R.id.btn_go).setOnClickListener(this);

        weatherPresenter = new WeatherPresenterImpl(this); // 传入WeatherView
        loadingDialog = new ProgressDialog(this);
        loadingDialog.setTitle("加载天气中...");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void showLoading() {
        loadingDialog.show();
    }

    @Override
    public void hideLoading() {
        loadingDialog.dismiss();
    }

    @Override
    public void showError() {
        Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setWeatherInfo(Weather weather) {
        WeatherInfo info = weather.getWeatherinfo();
        city.setText(info.getCity());
        cityNO.setText(info.getCityid());
        temp.setText(info.getTemp());
        wd.setText(info.getWD());
        ws.setText(info.getWS());
        sd.setText(info.getSD());
        wse.setText(info.getWS());
        time.setText(info.getTemp());
        njd.setText(info.getNjd());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_go) {
            weatherPresenter.getWeather(cityNOInput.getText().toString().trim());
        }
    }

}
