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
        car.drive();



        // Получаем бин BookingService из контекста
        BookingService bookingService = context.getBean(BookingService.class);

        // Пробуем забронировать комнату с ID 2
        bookingService.bookRoom(2); // Успешная бронь

        // Пробуем снова забронировать ту же комнату
        bookingService.bookRoom(2); // Комната уже занята

        // Пробуем забронировать комнату с несуществующим ID
        bookingService.bookRoom(4); // Комната не существует
        context.close();
    }
}
