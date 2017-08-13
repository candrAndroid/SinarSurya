package com.vpresa.candra.sinarsurya;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by phpdev on 8/13/17.
 */

public class WeatherAdapter extends RecyclerView.Adapter <WeatherAdapter.WeatherViewHolder>{

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_weather,parent,false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {

        public WeatherViewHolder(View itemView) {
            super(itemView);
            mWeatherImage = (ImageView) itemView.findViewById(R.id.img_adapter_weather);
            mWeatherImage = (TextView) itemView.findViewById(R.id.txt_adapter_weather_date);
            mWeatherImage = (TextView) itemView.findViewById(R.id.txt_adapter_weather_cuaca);
            mWeatherImage = (ImageView) itemView.findViewById(R.id.txt_adapter_weather_temperature);
        }

        public void onClick(View v){

        }
        // Toast.makeText(v.getContext(),"Posisi ke-" + getAdapter)
    }
}
