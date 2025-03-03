package org.example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    List<Room> rooms;

    public HotelService() {
        rooms = new ArrayList<>();
        rooms.add(new Room(1, "Однокомнатная"));
        rooms.add(new Room(2, "Двух-комнатная"));
        rooms.add(new Room(3, "Президентский люкс"));
    }

    public Room getRoomById(int id) {
        for (Room room : rooms) {
            if (room.id == id) {
                return room;
            }
        }
        return null;
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
