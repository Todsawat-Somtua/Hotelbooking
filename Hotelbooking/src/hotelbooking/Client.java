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
    private static int nextid;

    public Client(String firstname, String lastname) {
        bookingid = ++nextid;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    String getFristname(){ return this.firstname; }
    String getLastname(){ return this.lastname; }
    int getId(){ return this.bookingid; }
    void setFristname(String firstname){ this.firstname = firstname;}
    void setLastname(String lastname){this.lastname = lastname;}
    
        @Override
    public String toString() {
        return "Client (" + "firstname : " + firstname + ", lastname : " + lastname + ", Your booking ID is :" + bookingid + '}';
    }
}