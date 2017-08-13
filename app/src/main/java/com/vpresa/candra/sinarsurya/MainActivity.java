package com.vpresa.candra.sinarsurya;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMainDays;
    private RecycleView mMainWeatherList;
    private TextView mMainTemperature;
    private TextView mMainWeatherName;
    private ImageView mMainWeatherImage;
    private LinearLayoutManager layoutManager;
    private WeatherAdapter mWeatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initviewBaru();
    }

    private void initviewBaru()
    {
        mMainDays = (TextView) findViewById(R.id.txt_hari);
        mMainWeatherImage = (ImageView) findViewById(R.id.img_cuaca);
        mMainWeatherName = (TextView) findViewById(R.id.txt_cuaca);
        mMainTemperature = (TextView) findViewById(R.id.txt_suhu);
        mMainWeatherList = (RecyclerView) findViewById(R.id.rv_weatherlist);

        mMainDays.setText("Senin");
        mMainWeatherImage.setImageResource(R.mipmap.ic_launcher_round);
        mMainTemperature.setText("32");
        mMainWeatherName.setText("Panas Banget");
     
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mMainWeatherList.setLayoutManager(layoutManager);
        mMainWeatherList.setHasFixedSize(true);
        
        mWeatherAdapter = new WeatherAdapter();
        mMainWeatherList.setAdapter(mWeatherAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
