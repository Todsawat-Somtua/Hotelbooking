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
public class Client {

    private String firstname;
    private String lastname;
    private int bookingid;
    private static int nextID;

    public Client(String firstname, String lastname) {
        bookingid = ++nextID;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public String getFristname(){ return this.firstname; }
    public String getLastname(){ return this.lastname; }
    public int getId(){ return this.bookingid; }
    public void setFristname(String firstname){ this.firstname = firstname;}
    public void setLastname(String lastname){this.lastname = lastname;}
    
        @Override
    public String toString() {
        return "Client ( " + firstname +" "+ lastname + " Your booking ID is : " + bookingid + " }";
    }
}