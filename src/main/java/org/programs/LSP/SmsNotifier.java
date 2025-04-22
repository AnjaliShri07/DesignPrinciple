package org.programs.LSP;

public final class SmsNotifier implements Notifier {
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
