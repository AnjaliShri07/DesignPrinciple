package org.programs.DIP;

public class DatabaseLogger implements Logger {
    public void log(String message) {
        System.out.println("DB Log: " + message);
    }
}
