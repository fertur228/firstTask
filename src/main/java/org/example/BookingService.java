package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final HotelService hotelService;

    @Autowired // Это указывает, что Spring должен инжектить зависимость в конструктор
    public BookingService(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public void bookRoom(int roomId) {
        Room room = hotelService.getRoomById(roomId);
        if (room != null) {
            if (room.isAvailable) {
                room.book();
                System.out.println("Room " + room.id + " (" + room.type + ") has been successfully booked.");
            } else {
                System.out.println("Room " + room.id + " (" + room.type + ") is already booked.");
            }
        } else {
            System.out.println("Room with ID " + roomId + " does not exist.");
        }
    }
}
