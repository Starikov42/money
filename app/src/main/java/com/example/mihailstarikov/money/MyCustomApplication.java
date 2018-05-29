package com.example.mihailstarikov.money;

import android.app.Application;
import android.content.res.Configuration;

public class MyCustomApplication extends Application {
    public static DB db;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
