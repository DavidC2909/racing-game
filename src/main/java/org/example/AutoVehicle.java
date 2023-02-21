package org.example;

public class AutoVehicle extends Vehicle {

    // "has-a" relationship (aggregation)
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine= engine;
    }
}
