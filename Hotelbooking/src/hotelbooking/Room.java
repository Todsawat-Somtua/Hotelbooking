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
public class Room {

    private String roomid = null;
    private boolean booked = false;

    public Room(String roomid) {
        this.roomid = roomid;
    }
    
    String getRoomid(){
        return this.roomid;
    }
    
    void cancel(){
        booked = false;
    }
    
    boolean isBooked(){
        return this.booked;
    }
    
}