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
public class Booking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client client1 = new Client("Todsawat","Somtua");
        System.out.println(client1);
        client1.setFristname("Ballistixd");
        System.out.println(client1);
        Client client2 = new Client ("Suppakarn","Keawloy");
        System.out.println(client2);
        client2.setLastname("Somtua");
        System.out.println(client2);
        client2.setLastname("Suppakarn");
        System.out.println(client2);
    }
}