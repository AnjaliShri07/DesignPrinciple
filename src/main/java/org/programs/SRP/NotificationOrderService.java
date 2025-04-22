package org.programs.SRP;

// Separate class for notifications
public class NotificationOrderService {
    public void sendOrderConfirmation(String userEmail) {
        System.out.println("Sending confirmation to " + userEmail);
    }
}

/*Why? You may need to change email logic without touching order placement.*/
