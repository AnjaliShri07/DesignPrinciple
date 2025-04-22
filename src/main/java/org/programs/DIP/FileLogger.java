package org.programs.DIP;

public class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("File Log: " + message);
    }
}
