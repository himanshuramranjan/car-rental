package model;

import enums.ReservationStatus;
import enums.ReservationType;
import enums.VehicleStatus;
import enums.VehicleType;
import factory.ReservationFactory;
import model.reservation.HourlyReservation;
import model.reservation.Reservation;
import model.vehicle.Vehicle;
import service.PaymentService;
import service.VehicleInventory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private final int storeId;
    private Location location;
    private VehicleInventory vehicleInventory;
    private List<Reservation> reservations;

    public Store(int storeId, Location location, List<Vehicle> vehicles) {
        this.storeId = storeId;
        this.location = location;
        this.vehicleInventory = new VehicleInventory(vehicles);
        this.reservations = new ArrayList<>();
    }

    public List<Vehicle> getAllVehicles(VehicleType vehicleType) {
        return this.vehicleInventory.getAvailableVehicles(vehicleType);
    }

    public Reservation reserveVehicle(User user, Vehicle vehicle, LocalDateTime pickupTime, Location dropLocation, ReservationType reservationType)
    {
        Reservation reservation = ReservationFactory.createReservation(
                reservationType,
                user,
                vehicle,
                pickupTime,
                this.location,
                dropLocation
        );
        reservations.add(reservation);

        reservation.setReservationStatus(ReservationStatus.INPROGRESS);
        reservation.getVehicle().setStatus(VehicleStatus.RENTED);
        System.out.println("Reservation done");
        return reservation;
    }

    public void completeReservation(Reservation reservation, PaymentService paymentService) {

        Bill bill = reservation.generateBill();
        paymentService.makePayment(bill);

        // we can add check if payments status of bill is success or fail
        reservations.remove(reservation);
        reservation.getVehicle().setStatus(VehicleStatus.AVAILABLE);
        reservation.setReservationStatus(ReservationStatus.COMPLETED);

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
