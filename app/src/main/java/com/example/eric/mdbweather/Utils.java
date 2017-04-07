package com.example.eric.mdbweather;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.thbs.skycons.library.CloudFogView;
import com.thbs.skycons.library.CloudHvRainView;
import com.thbs.skycons.library.CloudMoonView;
import com.thbs.skycons.library.CloudRainView;
import com.thbs.skycons.library.CloudSnowView;
import com.thbs.skycons.library.CloudSunView;
import com.thbs.skycons.library.CloudThunderView;
import com.thbs.skycons.library.CloudView;
import com.thbs.skycons.library.MoonView;
import com.thbs.skycons.library.SunView;
import com.thbs.skycons.library.WindView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by eric on 3/8/17.
 */

public class Utils {

    public static final char DEGREE_SYMBOL = (char) 0x00B0;

    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    static String epocToDate(long time){
        Date date = new Date(time*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getDefault());
        String formattedDate = sdf.format(date);
        return formattedDate;
    }

    static String epocToDateWithTime(long time){
        Date date = new Date(time*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getDefault());
        String formattedDate = sdf.format(date);
        return formattedDate;
    }

    static void setSkyconImage(String image_code, RelativeLayout skycon_image, Context context){
        switch (image_code){
            case "clear-day":
                SunView sun = new SunView(context);
                sun.setBgColor(Color.argb(0, 0, 0, 0));
                sun.setStrokeColor(Color.GRAY);
                skycon_image.addView(sun);
                break;
            case "clear-night":
                MoonView moon = new MoonView(context);
                moon.setBgColor(Color.argb(0, 0, 0, 0));
                moon.setStrokeColor(Color.GRAY);
                skycon_image.addView(moon);
                break;
            case "rain":
                CloudRainView cloudRain = new CloudRainView(context);
                cloudRain.setBgColor(Color.argb(0, 0, 0, 0));
                cloudRain.setStrokeColor(Color.GRAY);
                skycon_image.addView(cloudRain);
                break;
            case "snow":
                CloudSnowView cloudSnow = new CloudSnowView(context);
                cloudSnow.setBgColor(Color.argb(0, 0, 0, 0));
                cloudSnow.setStrokeColor(Color.GRAY);
                skycon_image.addView(cloudSnow);
                break;
            case "sleet":
                CloudHvRainView sleet = new CloudHvRainView(context);
                sleet.setBgColor(Color.argb(0, 0, 0, 0));
                sleet.setStrokeColor(Color.GRAY);
                skycon_image.addView(sleet);
                break;
            case "wind":
                WindView wind = new WindView(context);
                wind.setBgColor(Color.argb(0, 0, 0, 0));
                wind.setStrokeColor(Color.GRAY);
                skycon_image.addView(wind);
                break;
            case "fog":
                CloudFogView cloudFog = new CloudFogView(context);
                cloudFog.setBgColor(Color.argb(0, 0, 0, 0));
                cloudFog.setStrokeColor(Color.GRAY);
                skycon_image.addView(cloudFog);
                break;
            case "cloudy":
                CloudView cloud = new CloudView(context);
                cloud.setBgColor(Color.argb(0, 0, 0, 0));
                cloud.setStrokeColor(Color.GRAY);
                skycon_image.addView(cloud);
                break;
            case "partly-cloudy-day":
                CloudSunView cloudSun = new CloudSunView(context);
                cloudSun.setBgColor(Color.argb(0, 0, 0, 0));
                cloudSun.setStrokeColor(Color.GRAY);
                skycon_image.addView(cloudSun);
                break;
            case "partly-cloudy-night":
                CloudMoonView cloudMoon = new CloudMoonView(context);
                cloudMoon.setBgColor(Color.argb(0, 0, 0, 0));
                cloudMoon.setStrokeColor(Color.GRAY);
                skycon_image.addView(cloudMoon);
                break;
            case "thunderstorm":
                CloudThunderView thunder = new CloudThunderView(context);
                thunder.setBgColor(Color.argb(0, 0, 0, 0));
                thunder.setStrokeColor(Color.GRAY);
                skycon_image.addView(thunder);
                break;
        }

    }
}
