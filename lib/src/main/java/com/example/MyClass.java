package com.example;

import java.util.Arrays;

import rx.Observable;

public class MyClass {
    private final int mNumber;

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
}
