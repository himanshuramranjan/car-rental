package model;

public class Bike extends Vehicle{
    public Bike(int vehicleId, String vehicleNum, String company, String modelName, double dailyRentalCost, double hourlyRentalCost, double average, int seats) {
        super(vehicleId, vehicleNum, company, modelName, dailyRentalCost, hourlyRentalCost, average, seats, VehicleStatus.AVAILABLE, VehicleType.BIKE);
    }
}
