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

    public Room(String roomid) {this.roomid = roomid;}
    public String getRoomid(){return roomid;} 
    public boolean isBooked(){return booked;}
    public void cancel(){booked = false;}
    public void setBooked(boolean booked) {this.booked = booked;}
    
}