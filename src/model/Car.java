package model;

public class Car extends Vehicle {
    public Car(int vehicleId, String vehicleNum, String company, String modelName, double dailyRentalCost, double hourlyRentalCost, double average, int seats) {
        super(vehicleId, vehicleNum, company, modelName, dailyRentalCost, hourlyRentalCost, average, seats, VehicleStatus.AVAILABLE, VehicleType.CAR);
    }
}
