package org.example;

public class Room {
    int id;
    String type;
    boolean isAvailable;

    public Room(int id, String type) {
        this.id = id;
        this.type = type;
        this.isAvailable = true;
    }

    public void book() {
        this.isAvailable = false; //занята
    }
}


