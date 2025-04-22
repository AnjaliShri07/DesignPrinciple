package org.programs.LSP;

public final class EmailNotifier implements Notifier {
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}
