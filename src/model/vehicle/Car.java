package model.vehicle;

import enums.VehicleType;

public class Car extends Vehicle {
    public Car(int vehicleId, String vehicleNum, double dailyRentalCost, double hourlyRentalCost) {
        super(vehicleId, vehicleNum, dailyRentalCost, hourlyRentalCost, VehicleType.CAR);
    }

    public Car(int vehicleId) {
        super(vehicleId, VehicleType.CAR);
    }
}
