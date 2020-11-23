package hotelbooking;

import java.util.Scanner;

/**
 *
 * @author Ballistixd
 * @author TeamzFactor
 */
public class App {

    public static void main(String[] args) {
        do {
            String menuStr = "1. Booking new room \n"
                    + "2. Checkout \n"
                    + "0. Exit";

            System.out.println(menuStr);
            System.out.print("Select menu : ");
            selecter = scn.nextInt();
            scn.nextLine();
            switch (selecter) {
                case 1: {
                    boolean exited;
                    do {
                        int state = Checkin();
                        exited = (state == 0) ? false : true;
                        switch (state) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                    } while (exited);
                    break;
                }
                case 2: {
                    boolean exited;
                    do {
                        int state = Checkout();
                        exited = (state == 0) ? false : true;
                        switch (state) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                    } while (exited);
                    break;
                }
            }
        } while (selecter != 0);
    }

    private static BookingController bc = new BookingController(); // pull method from BookingProcess class
    private static Scanner scn = new Scanner(System.in); // import user input
    private static int selecter;
    private static Room rm = null; // pull method from Room class

    private static int Checkin() {
        int state = 0;
        System.out.println("Checkin : Choose the room");
        for (Room room : bc.getRoomdataAll().getRoom()) {
            System.out.println(room.toString());
        }
        System.out.print("Enter room number or 0 to back : ");
        int roomid = scn.nextInt(); //for save user data's input
        System.out.println("\n");
        if (roomid == 0) {
            state = 0;
        } else {
            if (BookingController.getRoom(roomid) == null) {
                System.out.println("Enter wrong number : ".toUpperCase() + roomid);
                state = 1;
            } else {
                rm = bc.getRoom(roomid);
                if (!rm.isBooked()) {
                    System.out.println("Your room is: " + rm.getRoomid());
                    System.out.println("Book successfully !!");
                    rm.setBooked(true);
                    state = 1;
                }
            }
        }
        return state;
    }

    private static int Checkout() {
        int state = 0;
        System.out.println("Checkout : Choose the room");
        for (Room room : bc.getRoomdataAll().getRoom()) {
            System.out.println(room.toString());
        }
        System.out.print("Enter room number or 0 to back : ");
        int roomid = scn.nextInt(); //for save user data's input
        System.out.println("\n");
        if (roomid == 0) {
            state = 0;
        } else {
            if (BookingController.getRoom(roomid) == null) {
                System.out.println("Enter wrong number : ".toUpperCase() + roomid);
                state = 1;
            } else {
                rm = bc.getRoom(roomid);
                if (rm.isBooked()) {
                    System.out.println("Your room is: " + rm.getRoomid());
                    System.out.println("Book successfully !!");
                    rm.setBooked(false);
                    state = 1;
                }
            }
        }
        return state;
    }
}
