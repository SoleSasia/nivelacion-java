package com.sole;

public class EmailNotifier implements Notifier{

    public void notify(String message) {
        System.out.println("Sending email: " + message);
    }
}
