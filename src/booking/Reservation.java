package booking;

import model.Location;
import model.User;
import model.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    private final String reservationId;
    private final User user;
    private Vehicle vehicle;
    private LocalDateTime pickupTime;
    private LocalDateTime dropTime;
    private Location pickupLocation;
    private Location dropLocation;
    private ReservationStatus reservationStatus;
    private ReservationType reservationType;

    public Reservation(User user, Vehicle vehicle, LocalDateTime pickupTime, LocalDateTime dropTime, Location pickupLocation, Location dropLocation, ReservationType reservationType) {
        this.reservationId = UUID.randomUUID().toString();
        this.user = user;
        this.vehicle = vehicle;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.reservationStatus = ReservationStatus.SCHEDULED;
        this.reservationType = reservationType;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public void setDropTime(LocalDateTime dropTime) {
        this.dropTime = dropTime;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

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

    public LocalDateTime getDropTime() {
        return dropTime;
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

    public ReservationType getReservationType() {
        return reservationType;
    }
}
