package hotelbooking;

import java.util.ArrayList;

/**
 *
 * @author Ballistixd
 * @author TeamzFactor
 */
public class RoomData {
//    String[] roomid = new String[6];

    private ArrayList<Room> room;
    private int[] roomID = {101, 102, 103, 104, 105, 106};

    public RoomData() {
        room = new ArrayList<Room>();
        for (int i = 0; i < roomID.length; i++) {
            addRoom(new Room(roomID[i]));
        }
    }

    public void addRoom(Room addRoom) {
        room.add(addRoom);
    }

    public ArrayList<Room> getRoom() {
        return room;
    }

}
