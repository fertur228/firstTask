package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car car = context.getBean(Car.class);

        car.drive();
        car.drive();
        car.drive();

        // Получаем бин BookingService из контекста
        BookingService bookingService = context.getBean(BookingService.class);


        bookingService.bookRoom(2);


        bookingService.bookRoom(2);


        bookingService.bookRoom(4);



    }
}
