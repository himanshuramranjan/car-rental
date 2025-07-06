package model;

import enums.PaymentStatus;
import model.reservation.Reservation;

import java.util.UUID;

public class Bill {
    private final String billId;
    private final Reservation reservation;
    private double amount;
    private PaymentStatus paymentStatus;

    public Bill(Reservation reservation, double amount) {
        this.billId = UUID.randomUUID().toString();
        this.reservation = reservation;
        this.amount = amount;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
