package org.example;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class HotelService {
    List<Room> rooms;

    public HotelService() {
        rooms = new ArrayList<>();
        rooms.add(new Room(1, "Single"));
        rooms.add(new Room(2, "Double"));
        rooms.add(new Room(3, "Suite"));
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
