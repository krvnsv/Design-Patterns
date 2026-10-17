package com.kirill.facade;

public class StreamingDevice {

    public void turnOn() {
        System.out.println("Streaming device turned on");
    }

    public void openApp(String appname) {
        System.out.println("Opening " + appname);
    }

    public void play(String movie) {
        System.out.println("Playing " + movie);
    }

    public void stop() {
        System.out.println("Stoping movie");
    }

    public void turnOff() {
        System.out.println("Streaming device turned off");
    }
}
