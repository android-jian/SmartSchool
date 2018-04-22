package com.yue.android.smartschool;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by dell on 2018/4/22.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
