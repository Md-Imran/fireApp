package com.dreampany.fireapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Imran on 5/8/2018.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(getApplicationContext());

    }
}
