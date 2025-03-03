package model;

public class Vehicle {
    private int vehicleId;
    private String vehicleNum;
    private String company;
    private String modelName;
    private double dailyRentalCost;
    private double hourlyRentalCost;
    private double average;
    private int noOfSeats;
    private VehicleStatus status;
    private VehicleType type;

    public Vehicle(int vehicleId, VehicleType type) {
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public Vehicle(int vehicleId, String vehicleNum, String company, String modelName, double dailyRentalCost, double hourlyRentalCost, double average, int noOfSeats, VehicleStatus status, VehicleType type) {
        this.vehicleId = vehicleId;
        this.vehicleNum = vehicleNum;
        this.company = company;
        this.modelName = modelName;
        this.dailyRentalCost = dailyRentalCost;
        this.hourlyRentalCost = hourlyRentalCost;
        this.average = average;
        this.noOfSeats = noOfSeats;
        this.status = status;
        this.type = type;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public void setDailyRentalCost(double dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public void setHourlyRentalCost(double hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getDailyRentalCost() {
        return dailyRentalCost;
    }

    public double getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public VehicleType getVehicleType() {
        return type;
    }

    public int getVehicleId() {
        return vehicleId;
    }
}
