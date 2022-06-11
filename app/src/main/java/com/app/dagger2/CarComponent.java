package com.app.dagger2;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    public void inject(MainActivity mainActivity);
}
