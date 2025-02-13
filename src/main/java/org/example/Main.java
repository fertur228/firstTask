package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car car = context.getBean(Car.class);

        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive(); // После 5 поездок топлива не останется!

        context.close();
    }
}
