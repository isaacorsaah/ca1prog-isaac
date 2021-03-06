package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerStore {

    private final ArrayList<Passenger> passengerList;

    public PassengerStore(String fileName) {
        this.passengerList = new ArrayList<>();
        loadPassengerDataFromFile(fileName);
    }

    public List<Passenger> getAllPassengers() {
        return this.passengerList;
    }

    public void displayAllPassengers() {
        for (Passenger p : this.passengerList) {
            System.out.println(p.toString());
        }
    }

    /**
     * Read Passenger records from a text file and create and add Passenger
     * objects to the PassengerStore.
     */
    private void loadPassengerDataFromFile(String filename) {

        try {
            Scanner sc = new Scanner(new File(filename));
//           Delimiter: set the delimiter to be a comma character ","
//                    or a carriage-return '\r', or a newline '\n'
            sc.useDelimiter("[,\r\n]+");

            while (sc.hasNext()) {
                int id = sc.nextInt();
                String name = sc.next();
                String email = sc.next();
                String phone = sc.next();
                double latitude = sc.nextDouble();
                double longitude = sc.nextDouble();

                // construct a Passenger object and add it to the passenger list
                passengerList.add(new Passenger(id, name, email, phone, latitude, longitude));
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("Exception thrown. " + e);
        }
    }

    // TODO - see functional spec for details of code to add

    public void addPassenger(Passenger p){
        boolean found = false;

        for(Passenger pp: passengerList){
            if(pp.equals(p)){
                found = true;
            }else {
                found = false;
            }
        }

        if(found == false){
            passengerList.add(p);
            System.out.println("Passenger Added to the list..");
        }else{
            System.out.println("Error: Passenger already exist");
        }
    }

    public Passenger findPassengerByName(String name){
        Passenger found = null;
        for(Passenger p : passengerList){
            if(p.getName().equals(name)){
                found = p;
            }
        }
        return found;
    }

    public Passenger findPassengerById(int id){
        Passenger found = null;
        for(Passenger p : passengerList){
            if(p.getId() == id){
                found = p;
            }
        }
        return found;
    }
    public void deleteById(int id){
        boolean found = false;
        for(Passenger p: passengerList){
            if(p.getId() == id){
                found = true;
            }
        }
        if(found == true){
            for(Passenger p: passengerList){
                if(p != null){
                    System.out.println(p.toString());
                }else{
                    System.out.println("PASSENGER HAS BEEN DELETED");
                }
            }
        }else{
            System.out.println("PASSENGER DOES NOT EXIST");
        }

    }
} // end class
