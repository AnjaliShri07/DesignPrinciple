package org.programs.OCP;

public final class UpiPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid using UPI: ₹" + amount);
    }
}
