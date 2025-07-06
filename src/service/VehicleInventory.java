package service;

import enums.VehicleStatus;
import enums.VehicleType;
import model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    private final List<Vehicle> vehicles;

    public VehicleInventory(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getAvailableVehicles(VehicleType vehicleType) {
        List<Vehicle> availableVehicle = new ArrayList<>();
        for(Vehicle vehicle : vehicles) {
            if(vehicle.getStatus() == VehicleStatus.AVAILABLE && vehicle.getVehicleType() == vehicleType) {
                availableVehicle.add(vehicle);
            }
        }
        return availableVehicle;
     }

     public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
     }

     public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
     }
}
