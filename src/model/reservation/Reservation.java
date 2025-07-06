package model;

import enums.ReservationStatus;
import enums.ReservationType;
import model.Location;
import model.User;
import model.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Reservation {
    private final String reservationId;
    private final User user;
    private final Vehicle vehicle;
    private final LocalDateTime pickupTime;
    private final Location pickupLocation;
    private final Location dropLocation;
    private ReservationStatus reservationStatus;
    private ReservationType reservationType;

    protected Reservation(User user, Vehicle vehicle, LocalDateTime pickupTime, Location pickupLocation, Location dropLocation, ReservationType reservationType) {
        this.reservationId = UUID.randomUUID().toString();
        this.user = user;
        this.vehicle = vehicle;
        this.pickupTime = pickupTime;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.reservationStatus = ReservationStatus.SCHEDULED;
        this.reservationType = reservationType;
    }

    public abstract Bill generateBill();

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public String getReservationId() {
        return reservationId;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }
}
