package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;
    private final Transmission transmission;
    private final FuelTank fuelTank;

    @Autowired
    public Car(Engine engine, Transmission transmission, FuelTank fuelTank) {
        this.engine = engine;
        this.transmission = transmission;
        this.fuelTank = fuelTank;
    }

    public void drive() {
        if (fuelTank.hasFuel()) {
            engine.start();
            transmission.shiftGear();
            fuelTank.useFuel();
            System.out.println("Машина поехала!");
        } else {
            System.out.println("Машина не может ехать без топлива!");
        }
    }
}
