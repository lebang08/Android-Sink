package com.lebang.mylink;

import android.app.Application;
import android.content.Context;

/**
 * Created by LeBang on 2017/11/22
 */

public class YXApplication extends Application {

    private static YXApplication mApplicationContext;

    private boolean isBackCarOn;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = this;

//        SharedPrefsManager.init(mApplicationContext);
//        //初始化库
//        VehicleAdapterManager.getInstance();
//
//        CrashExceptionHandler.getInstance().init(mApplicationContext);

//        USBConnStatusManager.getInstance();
    }

    public static Context getContext() {
        return mApplicationContext;
    }

    public static YXApplication getInstance() {
        return mApplicationContext;
    }

    public boolean isBackCarOn() {
        return isBackCarOn;
    }

    public void setBackCarOn(boolean isBackCarOn) {
        this.isBackCarOn = isBackCarOn;
    }

}
