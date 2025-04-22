package org.programs;

import org.programs.DIP.AuditService;
import org.programs.DIP.FileLogger;
import org.programs.DIP.Logger;
import org.programs.ISP.Editor;
import org.programs.ISP.ReadPermission;
import org.programs.ISP.Viewer;
import org.programs.ISP.WritePermission;
import org.programs.LSP.EmailNotifier;
import org.programs.LSP.NotificationService;
import org.programs.LSP.Notifier;
import org.programs.LSP.SmsNotifier;
import org.programs.OCP.CreditCardPayment;
import org.programs.OCP.PaymentService;
import org.programs.OCP.UpiPayment;
import org.programs.SRP.NotificationOrderService;
import org.programs.SRP.OrderService;

public class Main {
    public static void main(String[] args) {
    // 1. Dependency Inversion - Use abstraction for logging
    Logger logger = new FileLogger(); // Could be DatabaseLogger too
    AuditService auditService = new AuditService(logger);
        auditService.record("User logged in");

    // 2. Single Responsibility - Order service does only order work
    OrderService orderService = new OrderService();
        orderService.placeOrder("ITEM123", 2);

    // Notification sent separately (SRP)
        NotificationOrderService notificationOrderService  = new NotificationOrderService();
        notificationOrderService.sendOrderConfirmation("order123@gmail.com");

    // 3. Open-Closed Principle - Process payment using strategy
    PaymentService paymentService = new PaymentService();
        paymentService.processPayment(new CreditCardPayment(), 500.00);
        paymentService.processPayment(new UpiPayment(), 300.00);

    // 4. Interface Segregation - Role-based access
    ReadPermission viewer = new Viewer();
        viewer.viewData();

    WritePermission editor = new Editor();
        editor.modifyData();

    // 5. Liskov Substitution - SMS works just like Email
        NotificationService notificationService = new NotificationService();
    Notifier smsNotifier = new SmsNotifier();
        notificationService.sendNotification(smsNotifier, "Delivery dispatched");
}
}