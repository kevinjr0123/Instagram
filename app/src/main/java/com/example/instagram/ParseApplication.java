package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mCk30XnO1CvlSDC1PFErujqhAMc0XaoKAdE2T8pv")
                .clientKey("P9AF6eUX9UFMZLCB44NVzovFIwuQJnUvcVono5al")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
