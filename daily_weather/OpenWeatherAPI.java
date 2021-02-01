package com.example.daily_weather;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class OpenWeatherAPI {
/*
    static RequestQueue requestQueue;
    WeatherAdapter adapter = new WeatherAdapter();

    makeRequest();
    requestQueue = Volley.newRequestQueue("http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtNcst?" +
            "serviceKey=kVYcCisbHyjiLHSoknw1iZbhenW6Glc2mM4hfGf1EeIHjXagq6P9g98eMXs6lFGtlksA74tis6Z677Ol%2FjiHrw%3D%3D&#38;" +
            "numOfRows=1&#38;" +
            "pageNo=1&#38;" +
            "base_date=" + 20151011 +"&#38;" +
            "base_time=" + 600 + "&#38;" +
            "nx= " + 18 +"&#38;" +
            "ny= " + 1);


    public void makeRequest() {
        String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtNcst";
        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        processResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                    }
                }) {
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                return params;
            }
        };

        request.setShouldCache(false);
        requestQueue.add(request);
    }

    public void processReponse(String response) {
        Gson gson = new Gson();
        Weather weatherList = gson.fromJson(response, Weather.class);

        for (int i = 0; i < 24 ; i++){
            Weather weather = weather.dailyWeatherList.get(i);

            adapter.addItem(weather_info);
        }

        adapter.notifyDataSetChanged();
    }

    public void println(String data) {
        textView.append(data + "\n");
    }

 */
}
