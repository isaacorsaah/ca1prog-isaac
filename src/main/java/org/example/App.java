package org.example;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDateTime;
import java.util.Collections;

/**
 * This Vehicle Bookings Management Systems manages the booking of Vehicles
 * by Passengers.
 *
 * This program reads from 3 text files:
 * "vehicles.txt", "passengers.txt", and "next-id-store.txt"
 * You should be able to see them in the project pane.
 * You will create "bookings.txt" at a later stage, to store booking records.
 *
 * "next-id-store.txt" contains one number ("201"), which will be the
 * next auto-generated id to be used to when new vehicles, passengers, or
 * bookings are created.  The value in the file will be updated when new objects
 * are created - but not when objects are recreated from records in
 * the files - as they already have IDs.  Dont change it - it will be updated by
 * the IdGenerator class.
 */

public class App
{
    public static void main(String[] args)
    {
        System.out.println("\nWelcome to the VEHICLE BOOKINGS MANAGEMENT SYSTEM - CA1 for OOP\n");

        // create PassengerStore and load it with passenger records from text file
        PassengerStore passengerStore = new PassengerStore("passengers.txt");
        System.out.println("List of all passengers:");
        passengerStore.displayAllPassengers();

//        VehicleManager vehicleManager = new VehicleManager("vehicles.txt");
//        System.out.println("List of all Vehicles:");
//        vehicleManager.displayAllVehicles();
//
//        System.out.println("---------------------FIND BY ID----------------------");
//        int vicID = 105;
//        if(vehicleManager.findVehicleById(vicID) != null){
//            System.out.println(vehicleManager.findVehicleById(vicID));
//        }else{
//            System.out.println("Error! No Vehicle Found!");
//        }
//        System.out.println("---------------------FIND BY MAKE----------------------");
//        String vicMake = "Fiat";
//        if(vehicleManager.findVehicleByMake(vicMake) != null){
//            System.out.println(vehicleManager.findVehicleByMake(vicMake));
//        }else{
//            System.out.println("Error! No Vehicle Found!");
//        }
//        System.out.println("---------------------FIND BY MAKE----------------------");
//
//        System.out.println("Program exiting... Goodbye");
//        System.out.println("---------------------BY SAME TYPE----------------------");
//        String vicMake2 = "Ford";
//        System.out.println(vehicleManager.sameMake(vicMake2));
//
//        System.out.println("---------------------Passenger----------------------");
//        passengerStore.displayAllPassengers();
//
//        System.out.println("---------------------Adding Passenger----------------------");
//        Passenger pp = new Passenger(104,"Joseph pro","ff@gmail.com","087 111 4444",55.44,33.55);
//        Passenger pp2 = new Passenger(106,"Joseph pro","ff@gmail.com","087 111 4444",55.44,33.55);
//        passengerStore.addPassenger(pp);
//        passengerStore.addPassenger(pp2);
//        passengerStore.displayAllPassengers();
//        System.out.println("---------------------Find Passenger By Name----------------------");
//        System.out.println(passengerStore.findPassengerName("Joseph pro"));

//        System.out.println("---------------------Print out all bookings In File----------------------");
//        BookingManager  BookinManager = new BookingManager("Booking.txt");
//        BookinManager.showAllBooking();

//         System.out.println("---------------------Print out all bookings in App----------------------");
//        BookingManager Bm = new BookingManager();
//        Bm.AddBooking(66,123,2012,3,11,13,50,55.55,66.6,77,89);
//        Bm.AddBooking(86,423,2014,2,15,15,35,55,77,88,111);
//        Bm.AddBooking(76,153,2015,6,14,11,42,22,44,66,88);
////        Bm.showAllBooking();
//
//        System.out.println("---------------------Print out all sorted bookings in App----------------------");
//        Collections.sort(Bm.getBookingList());
//        Bm.showAllBooking();
//
//        System.out.println("avgLongitude = " + Bm.avgLongitude());
//        System.out.println("avgLatitude = " + Bm.avgLatitude());



    }

}
