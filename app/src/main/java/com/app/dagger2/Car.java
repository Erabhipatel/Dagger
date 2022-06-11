package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    
    public static final String TAG = "Car";

    @Inject
    public Engine engine;

    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    public void enableCar(Remote remote){
        remote.setListener(this);
    }


    public void drive(){
        Log.d(TAG, "Driving...");
    }
}
