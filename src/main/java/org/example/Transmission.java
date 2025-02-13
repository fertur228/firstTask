package org.example;

import org.springframework.stereotype.Component;

@Component
public class Transmission {
    public void shiftGear() {
        System.out.println("Передача переключена!");
    }
}
