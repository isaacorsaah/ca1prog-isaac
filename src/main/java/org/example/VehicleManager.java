package org.example;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManager {
    private final ArrayList<Vehicle> vehicleList;  // for Car and Van objects

    public VehicleManager(String fileName) {
        this.vehicleList = new ArrayList<>();
        loadVehiclesFromFile(fileName);
    }

    public void displayAllVehicles() {
        for (Vehicle v : vehicleList)
            System.out.println(v.toString());
    }

    public void loadVehiclesFromFile(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
//           Delimiter: set the delimiter to be a comma character ","
//                    or a carriage-return '\r', or a newline '\n'
            sc.useDelimiter("[,\r\n]+");

            while (sc.hasNext()) {
                int id = sc.nextInt();
                String type = sc.next();  // vehicle type
                String make = sc.next();
                String model = sc.next();
                double milesPerKwH = sc.nextDouble();
                String registration = sc.next();
                double costPerMile = sc.nextDouble();
                int year = sc.nextInt();   // last service date
                int month = sc.nextInt();
                int day = sc.nextInt();
                int mileage = sc.nextInt();
                double latitude = sc.nextDouble();  // Depot GPS location
                double longitude = sc.nextDouble();
                int loadSpace = sc.nextInt();

                if (type.equalsIgnoreCase("Van") ||
                        type.equalsIgnoreCase("Truck")) {
                    // construct a Van object and add it to the passenger list
                    vehicleList.add(new Van(id, type, make, model, milesPerKwH,
                            registration, costPerMile,
                            year, month, day,
                            mileage, latitude, longitude,
                            loadSpace));
                }else{
                    vehicleList.add(new Car(id, type, make, model, milesPerKwH,
                            registration, costPerMile,
                            year, month, day,
                            mileage, latitude, longitude,
                            loadSpace));
                }
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("Exception thrown. " + e);
        }
    }

    //TODO add more functionality as per spec.
    public void addVehicle(Vehicle v){
        boolean found = false;
        for(Vehicle v2: vehicleList){
            if(v2.getId() == v.getId()){
              found = true;
            }
        }

        if(found = false){
            vehicleList.add(v);
            System.out.println("Vehicle has been added.");
        }else{
            System.out.println("ERROR");
        }

    }


    public Vehicle findVehicleById(int id){
        Vehicle v = null;
        for(int x = 0; x<this.vehicleList.size();x++) {
            if (this.vehicleList.get(x).getId() == id) {
                v = this.vehicleList.get(x);
            }
        }
        return v;
    }

    public Vehicle findVehicleByMake(String make){
        for(Vehicle v : vehicleList){
            if(v.getMake().equals(make)){
                return v;
            }
        }
        return null;
    }

    public ArrayList<Vehicle> sameMake(String make){
        ArrayList<Vehicle> same = new ArrayList<>();
        for(Vehicle v: vehicleList){
            if(v.getMake().equals(make)){
                same.add(v);
            }
        }
        return same;
    }
}
