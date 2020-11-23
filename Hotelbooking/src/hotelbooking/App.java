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
                    + "3. Add Room \n"
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
                case 3: {
                    boolean exited;
                    do {
                        int state = addRoom();
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
    
    private static Scanner scn = new Scanner(System.in); // import user input
    private static int selecter;
    private static Room rm = null; // pull method from Room class
    private static RoomData roomdata = new RoomData(); // new booked room

    private static int addRoomIdData(int numroom) {
        return roomdata.addRoom(numroom);
    }

    private static RoomData getRoomdataAll() {
        return roomdata;
    }

    private static Room getRoom(int roomid) {
        for (Room r : roomdata.getRoom()) {
            if (r.getRoomid() == roomid) {
                return r;
            }
        }
        return null;
    }

    private static int Checkin() {
        int state = 0;
        System.out.println("Checkin : Choose the room");
        for (Room room : getRoomdataAll().getRoom()) {
            System.out.println(room.toString());
        }
        System.out.print("Enter room number or 0 to back : ");
        int roomid = scn.nextInt(); //for save user data's input
        System.out.println("\n");
        if (roomid == 0) {
            state = 0;
        } else {
            if (getRoom(roomid) == null) {
                System.out.println("Enter wrong number : ".toUpperCase() + roomid);
                state = 1;
            } else {
                rm = getRoom(roomid);
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
        for (Room room : getRoomdataAll().getRoom()) {
            System.out.println(room.toString());
        }
        System.out.print("Enter room number or 0 to back : ");
        int roomid = scn.nextInt(); //for save user data's input
        System.out.println("\n");
        if (roomid == 0) {
            state = 0;
        } else {
            if (getRoom(roomid) == null) {
                System.out.println("Enter wrong number : ".toUpperCase() + roomid);
                state = 1;
            } else {
                rm = getRoom(roomid);
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

    public static int addRoom() {
        System.out.print("AddRoom : ");
        int roomid = scn.nextInt(); //for save user data's input
        System.out.println();
        int state = addRoomIdData(roomid);
        if (state == 0) {
            System.out.println("Add Room Success !!");
        }
        return state;
    }
}
