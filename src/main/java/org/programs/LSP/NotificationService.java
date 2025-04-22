package org.programs.LSP;

//Liskov Substitution Principle (LSP)
//Subtypes must be substitutable for their parent types
public class NotificationService {
    public void sendNotification(Notifier notifier, String msg) {
        notifier.notifyUser(msg);  // No issues regardless of type
    }
}

/*✅ Why? You can replace EmailNotifier with SmsNotifier and it’ll still work.*/
