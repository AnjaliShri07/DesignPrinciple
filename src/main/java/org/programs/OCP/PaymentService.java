package org.programs.OCP;

public class PaymentService {
    public void processPayment(PaymentStrategy strategy, double amount) {
        strategy.pay(amount);
    }
}

/*✅ Why? Easily add new payment types without changing PaymentService.*/
