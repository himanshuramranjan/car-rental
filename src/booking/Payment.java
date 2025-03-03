package booking;

import java.util.UUID;

public class Payment {
    private final String paymentId;
    private final Bill bill;
    private final PaymentMode paymentMode;

    public Payment(Bill bill, PaymentMode paymentMode) {
        this.paymentId = UUID.randomUUID().toString();
        this.bill = bill;
        this.paymentMode = paymentMode;
    }

    public void makePayment() {
        this.bill.setBillStatus(BillStatus.PAID);

        System.out.println("Paid Rs " + this.bill.getAmount() + " successfully");
        System.out.println("Your Reservation is successful");
    }

    public Bill getBill() {
        return bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
}
