package com.neumeng.drysister;

import android.app.Application;
import android.content.Context;

/**
 * Application类
 * Created by KOO on 2016-09-28.
 */

public class DrySisterApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static DrySisterApp getContext() {
        return (DrySisterApp) context;
    }
}
