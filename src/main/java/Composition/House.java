package Composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    public List<Room> rooms;

    public House(Room room){
        this.rooms = new ArrayList<>();
        rooms.add(room);
    }
}
