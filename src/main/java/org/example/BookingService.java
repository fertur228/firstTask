package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final HotelService hotelService;

    @Autowired
    public BookingService(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public void bookRoom(int roomId) {
        Room room = hotelService.getRoomById(roomId);
        if (room != null) {
            if (room.isAvailable) {
                room.book();
                System.out.println("Комната " + room.id + " (" + room.type + ") успешно забронирована!");
            } else {
                System.out.println("Комната " + room.id + " (" + room.type + ") была уже забронирована.");
            }
        } else {
            System.out.println("Комната с номером " + roomId + " не существует");
        }
    }
}
