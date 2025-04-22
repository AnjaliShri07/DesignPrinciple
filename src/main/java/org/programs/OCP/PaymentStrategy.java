package org.programs.OCP;

public sealed interface PaymentStrategy permits CreditCardPayment, UpiPayment {
    void pay(double amount);
}
