package com.example.daily_weather;

import android.content.Context;
import android.os.AsyncTask;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class getXML extends AsyncTask<String, Void, String> {

    Weather weather;

    private static final String TAG = "XMLParsingTask";
    private String receiveMsg = "";
    private String requestURL;
    public Context context;

    public getXML(String receiveMsg, Context context) {
        this.receiveMsg = receiveMsg;
        this.context = context;
    }

    protected String doInBackground(String... strings) {
        URL url;
        try{
            url = new URL("http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtFcst?serviceKey=kVYcCisbHyjiLHSoknw1iZbhenW6Glc2mM4hfGf1EeIHjXagq6P9g98eMXs6lFGtlksA74tis6Z677Ol%2FjiHrw%3D%3D&numOfRows=10&pageNo=1&base_date=20210128&base_time=0600&nx=55&ny=127");
            InputStream is = url.openStream();
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;
            int eventType = parser.getEventType();

            while(eventType != XmlPullParser.END_DOCUMENT){
                switch (eventType){

                    case XmlPullParser.START_DOCUMENT:

                        break;

                    case XmlPullParser.END_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        if(parser.getName().equals("item")){

                                }
                        if(parser.getName().equals("category"))
                                    weather.setCategory("sky");

                        break;

                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("item")){}
                        break;
                }
                eventType = parser.next();
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return receiveMsg;
    }

    protected void onProgressUpdate(Void... values){
        super.onProgressUpdate(values);
    }
    protected void onPostExecute(String s){
        super.onPostExecute(s);
    }

}