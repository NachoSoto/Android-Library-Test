package com.example;

import javax.inject.Inject;

/**
 * @author NachoSoto
 */
public class Car {
    private final Engine engine;

    @Inject
    public Car(final Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
