package model;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    public static volatile VehicleInventory vehicleInventory;
    private final List<Vehicle> vehicles;

    private VehicleInventory(List<Vehicle> vehicles) { this.vehicles = vehicles; }

    public static VehicleInventory getInstance(List<Vehicle> vehicles) {
        if(vehicleInventory == null) {
            synchronized (VehicleInventory.class) {
                if(vehicleInventory == null) {
                    vehicleInventory = new VehicleInventory(vehicles);
                }
            }
        }
        return vehicleInventory;
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
