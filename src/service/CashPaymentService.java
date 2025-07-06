package service;

import enums.PaymentStatus;
import model.Bill;

public class CashPaymentService implements PaymentService {

    @Override
    public void makePayment(Bill bill) {
        // simple implementation, can be factored with FAILED payment txn
        bill.setPaymentStatus(PaymentStatus.PAID);
        System.out.println("Paid Rs " + bill.getAmount() + " successfully through Cash");
    }
}
