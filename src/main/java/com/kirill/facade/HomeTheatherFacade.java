package com.kirill.facade;

public class HomeTheatherFacade {

    private final TV tv;
    private final SoundSystem soundSystem;
    private final StreamingDevice streamingDevice;
    private final Lights lights;

    public HomeTheatherFacade(
            TV tv,
            SoundSystem soundSystem,
            StreamingDevice streamingDevice,
            Lights lights) {

        this.tv = tv;
        this.soundSystem = soundSystem;
        this.streamingDevice = streamingDevice;
        this.lights = lights;
    }

    public void watchMovie(String movie) {

        System.out.println("Preparing home theather...");

        lights.dim();

        tv.turnOn();

        soundSystem.turnOn();
        soundSystem.setVolume(50);

        streamingDevice.turnOn();
        streamingDevice.openApp("Netflix");
        streamingDevice.play(movie);
    }

    public void endMovie() {

        System.out.println("Shutting down home theather...");

        streamingDevice.stop();
        streamingDevice.turnOff();

        soundSystem.turnOff();

        tv.turnOff();

        lights.turnOn();
    }
}
