import enums.ReservationType;
import model.Bill;
import model.vehicle.Bike;
import model.vehicle.Car;
import model.vehicle.Vehicle;
import service.CashPaymentService;
import model.reservation.Reservation;
import enums.VehicleStatus;
import enums.VehicleType;
import model.*;
import service.PaymentService;
import service.VehicleRentalSystem;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystemApplication {
    public static void main(String[] args) {

        //create users
        User user1 = new User(1, "ABCD", "20212365435");
        User user2 = new User(2, "EDFE", "54324567896");


        //create vehicles
        List<Vehicle> vehicleList1= new ArrayList<>();
        List<Vehicle> vehicleList2= new ArrayList<>();
        Vehicle vehicle1= new Car(1, "123", 5000, 200);
        Vehicle vehicle2= new Car(2, "234", 8000, 400);
        Vehicle vehicle3= new Bike(3, "346", 4000, 100);
        Vehicle vehicle4= new Bike(4, "458", 2000, 50);
        vehicleList1.add(vehicle1);
        vehicleList1.add(vehicle2);
        vehicleList2.add(vehicle3);
        vehicleList2. add(vehicle4);

        //create locations
        Location location1 = new Location("UP", "Noida", "Sector 135",
                 201304);

        //create stores
        Store store1= new Store(1, location1, vehicleList1);
        Store store2= new Store(2, location1, vehicleList2);

        //add users and stores in vehicleRentalsystem
        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        vehicleRentalSystem.addUser(user1);
        vehicleRentalSystem.addUser(user2);

        vehicleRentalSystem.addStore(store1);
        vehicleRentalSystem.addStore(store2);

        //user1 wants to rent Car in Noida location
        List<Store> allStores= vehicleRentalSystem.findStores(location1);

        //user selects store 1 in the displayed list
        Store store= allStores.get(0);
        List<Vehicle> allVehicles = store.getAllVehicles(VehicleType.CAR);
        //user wants to reserve first car in the displayed list
        Vehicle reservedVehicle = allVehicles.get(1);
        Reservation reservation= store.reserveVehicle(user1, reservedVehicle,
                LocalDateTime.of(2025, Month.JUNE, 29, 05, 30, 00),
                location1, ReservationType.HOURLY);

        //user drops the vehicle
        store.completeReservation(reservation, new CashPaymentService());
    }
}