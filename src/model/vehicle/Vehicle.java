package model.vehicle;

import enums.VehicleStatus;
import enums.VehicleType;

public abstract class Vehicle {
    private int vehicleId;
    private String vehicleNum;
    private double dailyRentalCost;
    private double hourlyRentalCost;
    private VehicleStatus status;
    private VehicleType type;

    protected Vehicle(int vehicleId, VehicleType type) {
        this.vehicleId = vehicleId;
        this.type = type;
    }

    protected Vehicle(int vehicleId, String vehicleNum, double dailyRentalCost, double hourlyRentalCost,VehicleType type) {
        this.vehicleId = vehicleId;
        this.vehicleNum = vehicleNum;
        this.dailyRentalCost = dailyRentalCost;
        this.hourlyRentalCost = hourlyRentalCost;
        this.status = VehicleStatus.AVAILABLE;
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
