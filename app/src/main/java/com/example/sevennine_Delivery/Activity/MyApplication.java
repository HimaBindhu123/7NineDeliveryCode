package com.example.sevennine_Delivery.Activity;

import android.app.Application;

import com.example.sevennine_Delivery.AppEnvironment;


public class MyApplication extends Application {

    private static MyApplication mInstance;
    AppEnvironment appEnvironment;
    @Override
    public void onCreate() {
        super.onCreate();
        appEnvironment = AppEnvironment.SANDBOX;
        mInstance = this;

    }
    public AppEnvironment getAppEnvironment() {
        return appEnvironment;
    }
    public void setAppEnvironment(AppEnvironment appEnvironment) {
        this.appEnvironment = appEnvironment;
    }
    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }



}
