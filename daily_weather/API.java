package com.example.daily_weather;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class API {
    URL url;
    String PTY;
    String RN1;
    String SKY;
    String T1H;
    String REH;

    Date base_date;
    String time0 = "0000";
    String time6 = "0600";
    String time12 = "1200";
    String time18 = "1800";

    int nx;
    int ny;

    {
        try {
            url = new URL("http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtFcst?" +
                    "serviceKey=kVYcCisbHyjiLHSoknw1iZbhenW6Glc2mM4hfGf1EeIHjXagq6P9g98eMXs6lFGtlksA74tis6Z677Ol%2FjiHrw%3D%3D&pageNo=1&" +
                    "numOfRows=60&" +
                    "dataType=XML&" +
                    "base_date=20210128&" +
                    "base_time=0000&" +
                    "nx=55&" +
                    "ny=127");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
