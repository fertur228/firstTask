package org.example;

import org.springframework.stereotype.Component;

@Component
public class FuelTank {
    private int fuel = 50; // изначально 50 литров бензина

    public boolean hasFuel() {
        return fuel > 0;
    }

    public void useFuel() {
        if (fuel > 0) {
            fuel -= 10;
            System.out.println("Топливо использовано! Осталось " + fuel + " литров.");
        } else {
            System.out.println("Топливо закончилось!");
        }
    }
}
