package com.example;

import java.util.Arrays;

import javax.inject.Inject;

import rx.Observable;

public class MyClass {
    private final int mNumber;

    @Inject public Car car;

    public MyClass() {
        this(0);
    }

    public MyClass(final int number) {
        this.mNumber = number;
    }

    public int getNumber() {
        return mNumber;
    }

    public Observable<Integer> getNumbers() {
        return Observable.from(Arrays.asList(1, 2, 3));
    }

    public String getCarEngineName() {
        return car.getEngine().name;
    }
}
