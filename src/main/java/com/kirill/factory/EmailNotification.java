package com.kirill.factory;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending an EMAIL notification...");
    }
}