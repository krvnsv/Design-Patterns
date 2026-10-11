package com.kirill.factory;

public class PushNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending a PUSH notification...");
    }
}

