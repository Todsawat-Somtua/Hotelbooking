package hotelbooking;

/**
 *
 * @author Ballistixd
 */
public class Room {

    private int roomid;
    private boolean booked = false;

    public Room(int roomid) {
        this.roomid = roomid;
    }

    public int getRoomid() {
        return roomid;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        String status = (booked) ? "Booked" : "Free";
        return "Room " + roomid + " Booking Status : " + status;
    }
}
