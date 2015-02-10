package com.example;

/**
 * @author NachoSoto
 */
public class CarModuleBuilder {
    public static void build() {
        CarComponent carComponent = Dagger_CarComponent.builder()
                .carModule(new CarModule())
                .build();
    }
}
