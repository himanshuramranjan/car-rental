package model.reservation;

import enums.ReservationType;
import model.Bill;
import model.Location;
import model.User;
import model.vehicle.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyReservation extends Reservation {
    public HourlyReservation(User user, Vehicle vehicle, LocalDateTime pickupTime, Location pickupLocation, Location dropLocation) {
        super(user, vehicle, pickupTime, pickupLocation, dropLocation);
    }

    @Override
    public Bill generateBill() {
        long hours = Duration.between(getPickupTime(), LocalDateTime.now()).toHours();
        double amount = getVehicle().getHourlyRentalCost() * hours;
        return new Bill(this, amount);
    }
}
