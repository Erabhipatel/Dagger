package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    public static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG, "Car enabled");
    }
}
