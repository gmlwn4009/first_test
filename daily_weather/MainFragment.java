package com.example.daily_weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MainFragment extends Fragment {

    TextView textView;
    TextView timeView;
    TextView temperatureView;
    TextView rainrateView;


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.main_fragment, container, false);
        View view = inflater.inflate(R.layout.weather_item, container, false);

        timeView = (TextView) view.findViewById(R.id.time_view);
        temperatureView = (TextView) view.findViewById(R.id.temparature_view);
        rainrateView = (TextView) view.findViewById(R.id.rain_rate_view);

        RecyclerView recyclerView = v.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        WeatherAdapter adapter = new WeatherAdapter();
        recyclerView.setAdapter(adapter);


            for (int i = 0; i < 24; i++) {
                adapter.addItem(new weather_info("01:00", "00:00", "60%"));
            }


        //URL url = new URL("http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtFcst?serviceKey=kVYcCisbHyjiLHSoknw1iZbhenW6Glc2mM4hfGf1EeIHjXagq6P9g98eMXs6lFGtlksA74tis6Z677Ol%2FjiHrw%3D%3D&numOfRows=10&pageNo=1&base_date=20210128&base_time=0600&nx=55&ny=127");

        //String resultText = new getXML(getContext(), url).execute().get();

        return v;
    }

}