package org.programs.LSP;

public sealed interface Notifier permits EmailNotifier, SmsNotifier {
    void notifyUser(String message);
}
