/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

import java.util.Scanner;

/**
 *
 * @author Ballistixd
 */
public class Booking {

    /**
     */
    public static RoomData roomdata = new RoomData();

    public static void main(String[] args) {
        // TODO code application logic here
        int selecter; // menu
        String roomid; // for save user data's input
        Scanner scn = new Scanner(System.in); // import user input
        BookingProcess bp = new BookingProcess(); // pull method from other class
        RoomData rmdt; // pull method from other class
        Room rm; // pull method from other class
        String menuStr = "1. Booking new room \n"
//                + "2. Edit client name \n"
//                + "3. Show room booked \n"
                + "0. exit";
        System.out.println(menuStr);
        do {
            System.out.print("Select menu: ");
            selecter = scn.nextInt();
            scn.nextLine();
            switch (selecter) {
                case 1 -> {
                    System.out.print("Input your name: ");
                    String firstname = scn.nextLine();
                    System.out.print("Input your lastname: ");
                    String lastname = scn.nextLine();
                        int x = 1;
                        do {
                            System.out.println("Choose the room\n" + bp.getRoomlist(BookingProcess.roomdata));
                            roomid = scn.nextLine();
                            do {
                                if (BookingProcess.getRoom(roomid) == null) {
                                    System.out.println("Plese select the room again");
                                    break;
                                } else {
                                    rm = BookingProcess.getRoom(roomid);
                                    if (!rm.isBooked()) {
                                        System.out.println("Book successfully !!");
                                        rm.setBooked(true);
                                        x = 0;
                                        break;
                                    } else if (roomid != bp.getRoomlist(roomdata)) {
                                        System.out.println("please enter the room ID again");
                                    }
                                }
                            } while (true);
                        } while (true && x != 0);
                }
//
//                case 2 -> {
//
//                }
//                case 3 -> {
//                    System.out.println("3");
//                }
            }
        } while (selecter != 0);
    }
}
