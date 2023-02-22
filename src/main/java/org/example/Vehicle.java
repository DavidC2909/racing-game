package org.example;

import java.time.LocalDate;

public class Vehicle {

    // class variable (static variable)
    static int totalVehicleCount;

    // instance variables
    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;

    boolean damaged;
    String color;

    LocalDate manufacturingDate= LocalDate.now().minusMonths(4);

    public Vehicle() {
        totalVehicleCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        if (fuelLevel <= 0 || damaged) {
            System.out.println("You cannot accelerate.");
            return 0;
        }


       if (speed > maxSpeed) {
           System.out.println("Max speed exceeded.");
           return 0;
       }
       else if (speed == maxSpeed){
           System.out.println("Careful, max speed reached.");
       }
       else {
           System.out.println("Valid speed entered.");
       }


        System.out.println(name + " is accelerating with " + speed + "km/h for " + durationInHours + "h");


       // local variable
        double distance= speed * durationInHours;

        totalTraveledDistance= totalTraveledDistance + distance;

        // same result as the statement above
 //     totalTraveledDistance += distance;

        System.out.println("Total traveled distance for vehicle" + name + ": " + totalTraveledDistance);

        double mileageMultiplier= 1;

        if (speed > 120){
            mileageMultiplier= speed / 100;
        }
        double usedFuel= distance * mileage / 100;

        fuelLevel= fuelLevel - usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + ": " + fuelLevel);

        return distance;
    }
}
