package model;

import enums.VehicleType;

public class Bike extends Vehicle{
    public Bike(int vehicleId, String vehicleNum, String company, String modelName, double dailyRentalCost, double hourlyRentalCost, double average, int seats) {
        super(vehicleId, vehicleNum, company, modelName, dailyRentalCost, hourlyRentalCost, average, seats, VehicleType.BIKE);
    }
    public Bike(int vehicleId) {
        super(vehicleId, VehicleType.BIKE);
    }
}
