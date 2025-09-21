package factory;

import enums.ReservationType;
import model.Location;
import model.User;
import model.reservation.DailyReservation;
import model.reservation.HourlyReservation;
import model.reservation.Reservation;
import model.vehicle.Vehicle;

import java.time.LocalDateTime;

public class ReservationFactory {
    public static Reservation createReservation(ReservationType reservationType,
                                                User user,
                                                Vehicle vehicle,
                                                LocalDateTime pickupTime,
                                                Location pickupLocation,
                                                Location dropLocation) {
        return switch (reservationType) {
            case HOURLY -> new HourlyReservation(user, vehicle, pickupTime, pickupLocation, dropLocation);
            case DAILY -> new DailyReservation(user, vehicle, pickupTime, pickupLocation, dropLocation);
            default -> throw new IllegalArgumentException("Invalid reservation type");
        };
    }
}