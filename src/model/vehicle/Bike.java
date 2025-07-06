package model.vehicle;

import enums.VehicleType;

public class Bike extends Vehicle {
    public Bike(int vehicleId, String vehicleNum, double dailyRentalCost, double hourlyRentalCost) {
        super(vehicleId, vehicleNum, dailyRentalCost, hourlyRentalCost, VehicleType.BIKE);
    }
    public Bike(int vehicleId) {
        super(vehicleId, VehicleType.BIKE);
    }
}
