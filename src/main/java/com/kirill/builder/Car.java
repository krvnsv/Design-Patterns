package com.kirill.builder;

public class Car {

    private final String engine;
    private final String transmission;
    private final String brakes;
    private final String suspension;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.brakes = builder.brakes;
        this.suspension = builder.suspension;
    }

    public static class Builder {
        private String engine;
        private String transmission;
        private String brakes;
        private String suspension;

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder brakes(String brakes) {
            this.brakes = brakes;
            return this;
        }

        public Builder suspension(String suspension) {
            this.suspension = suspension;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [ " +
                "Engine - " + engine + ", " +
                "Transmission - " + transmission + ", " +
                "Suspension - " + suspension + ", " +
                "Brakes - " + brakes +
                " ]";
    }
}
