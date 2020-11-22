package hotelbooking;

/**
 *
 * @author Ballistixd
 */
public class BookingController {

    private static RoomData roomdata = new RoomData(); // new booked room

    public static RoomData getRoomdataAll() {
        return roomdata;
    }

    public static Room getRoom(int roomid) {
        for (Room r : roomdata.getRoom()) {
            if (r.getRoomid() == roomid) {
                return r;
            }
        }
        return null;
    }
}
