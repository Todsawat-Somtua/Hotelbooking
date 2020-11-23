package hotelbooking;

import java.util.ArrayList;

/**
 *
 * @author Ballistixd
 * @author TeamzFactor
 */
public class RoomData {

    private ArrayList<Room> room;
    private int[] roomID = {101, 102, 103, 104, 105, 106};

    public RoomData() {
        room = new ArrayList<Room>();
        for (int i = 0; i < roomID.length; i++) {
            roomBook(new Room(roomID[i]));
        }
    }

    public int addRoom(int newroomid) {
        int state = 0;
        for (int roomid : roomID) {
            if (roomid == newroomid) {
                state = 1;
                break;
            } else {
                int newroomID[] = new int[roomID.length + 1];
                for (int i = 0; i < roomID.length - 1; i++) {
                    newroomID[i] = roomID[i];
                }
                newroomID[newroomID.length - 1] = newroomid;
                roomID = newroomID;
                roomBook(new Room(newroomid));
                break;
            }
        }
        return state;
    }

    public void roomBook(Room addRoom) {
        room.add(addRoom);
    }

    public ArrayList<Room> getRoom() {
        return room;
    }

}
