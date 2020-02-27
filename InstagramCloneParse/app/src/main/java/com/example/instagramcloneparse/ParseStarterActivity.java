package com.example.instagramcloneparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("ulLtkH86MwHdulPXbCggom8Dw48nF0zF4RyahPXs")
        .clientKey("eIA7QITLsQCOh6QXMlOavFMWdc2TkLoLeNj1qlBB")
        .server("https://parseapi.back4app.com/")
        .build()
        );

    }
}
