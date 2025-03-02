package model;

import booking.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private int storeId;
    private Location location;
    private VehicleInventory vehicleInventory;
    private List<Reservation> reservations;

    public Store(int storeId, Location location, List<Vehicle> vehicles) {
        this.storeId = storeId;
        this.location = location;
        this.vehicleInventory = VehicleInventory.getInstance(vehicles);
        this.reservations = new ArrayList<>();
    }

    public List<Vehicle> getAllVehicles(VehicleType vehicleType) {
        return this.vehicleInventory.getAvailableVehicles(vehicleType);
    }

    public Reservation reserveVehicle(User user, Vehicle vehicle, LocalDateTime pickupTime,
                               LocalDateTime dropTime, Location dropLocation)
    {
        Reservation reservation = new Reservation(user, vehicle, pickupTime, location, dropTime, dropLocation, ReservationType.DAILY);
        reservations.add(reservation);

        System.out.println("Reservation done");
        return reservation;
    }

    public void completeReservation(Reservation reservation) {
        reservations.remove(reservation);
        reservation.getVehicle().setStatus(VehicleStatus.AVAILABLE);

        System.out.println("Reservation completed");
    }

    public Location getLocation() {
        return location;
    }

    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}
