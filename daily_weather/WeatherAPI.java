package com.example.daily_weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class WeatherAPI {
    String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtFcst?serviceKey=kVYcCisbHyjiLHSoknw1iZbhenW6Glc2mM4hfGf1EeIHjXagq6P9g98eMXs6lFGtlksA74tis6Z677Ol%2FjiHrw%3D%3D&numOfRows=10&pageNo=1&base_date=20210127&base_time=0600&nx=55&ny=127";
    //request(url);

    public void request(String urlStr) {
        StringBuilder output = new StringBuilder();
        try {
            URL obj = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.getResponseCode();
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));


        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
