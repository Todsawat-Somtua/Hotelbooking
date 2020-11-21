/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

/**
 *
 * @author Ballistixd
 */
public class BookingProcess {

    static RoomData roomdata = new RoomData(); // new booked room
    String roomid;

    public String getRoomlist(RoomData roomdata) {
        String roomlist = "";
        for (Room r : roomdata.getRoom()) {
            if (!r.isBooked()) {
                roomlist = roomlist + r.getRoomid() + " is free" + "\n";
            } else {
                roomlist = roomlist + r.getRoomid() + " has been booked\n";
            }
        }
        return roomlist;
    }

    public static Room getRoom(String roomid) {
        for (Room r : roomdata.getRoom()) {
            if (r.getRoomid().equals(roomid)) {
                System.out.println("Your room is: " + r.getRoomid());
                return r;
            }
        }
        return null;
    }    
}
