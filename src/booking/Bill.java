package booking;

import java.util.UUID;

public class Bill {
    private final String billId;
    private final Reservation reservation;
    private double amount;
    private BillStatus billStatus;

    public Bill(Reservation reservation, double amount, BillStatus billStatus) {
        this.billId = UUID.randomUUID().toString();
        this.reservation = reservation;
        this.amount = amount;
        this.billStatus = billStatus;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public double getAmount() {
        return amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }
}
