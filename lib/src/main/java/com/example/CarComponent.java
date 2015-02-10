package com.example;

import dagger.Component;

@Component(modules = CarModule.class)
public interface CarComponent {
    Car car();
}

