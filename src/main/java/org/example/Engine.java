package org.example;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start() {
        System.out.println("🚗 Двигатель запущен!");
    }
}
