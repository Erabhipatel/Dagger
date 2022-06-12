package com.app.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        //car = carComponent.getCar();

        carComponent.inject(this);

        car.drive();

        System.out.println("Experiment commit");
        System.out.println("Changes 2");
        System.out.println("Hello from your friend");
    }
}