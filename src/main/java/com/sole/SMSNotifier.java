package com.sole;

public class SMSNotifier implements Notifier{
    @Override
    public void notify(String message) {
        System.out.println("Sending SMS: " + message);
    }

}
