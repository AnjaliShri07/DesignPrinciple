package org.programs.OCP;

public final class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid with Credit Card: ₹" + amount);
    }
}