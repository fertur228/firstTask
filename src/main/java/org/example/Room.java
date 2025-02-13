package org.example;

public class Room {
    int id;
    String type;
    boolean isAvailable;

    public Room(int id, String type) {
        this.id = id;
        this.type = type;
        this.isAvailable = true; // Комната доступна по умолчанию
    }

    public void book() {
        this.isAvailable = false; // Меняем состояние на "занята"
    }
}


