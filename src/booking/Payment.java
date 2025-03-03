package booking;

public class Payment {
    private final String paymentId;
    private final Bill bill;
    private final PaymentMode paymentMode;

    public Payment(String paymentId, Bill bill, PaymentMode paymentMode) {
        this.paymentId = paymentId;
        this.bill = bill;
        this.paymentMode = paymentMode;
    }

    public void makePayment(Bill bill, PaymentMode paymentMode) {
        bill.setBillStatus(BillStatus.PAID);

        System.out.println("Paid Rs " + bill.getAmount() + " successfully");
        System.out.println("Your Reservation is successful");
    }

    public Bill getBill() {
        return bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
}
