package service;

import model.Bill;

public interface PaymentService {
    void makePayment(Bill bill);
}
