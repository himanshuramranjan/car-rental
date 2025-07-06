package model;

import enums.ReservationType;

import java.time.Duration;
import java.time.LocalDateTime;

public class DailyReservation extends Reservation {

    protected DailyReservation(User user, Vehicle vehicle, LocalDateTime pickupTime, Location pickupLocation, Location dropLocation, ReservationType reservationType) {
        super(user, vehicle, pickupTime, pickupLocation, dropLocation, reservationType);
    }

    @Override
    public Bill generateBill() {
        long days = Duration.between(getPickupTime(), LocalDateTime.now()).toDays();
        double amount = getVehicle().getDailyRentalCost() * days;
        return new Bill(this, amount);
    }
}
