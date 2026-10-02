package com.kirill.builder;

public class Computer {

    private final String cpu;
    private final int ram;
    private final int storage;
    private final String gpu;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private String gpu;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [ " +
                "cpu - " + cpu + ", " +
                "ram - " + ram + ", " +
                "gpu - " + gpu + ", " +
                "storage - " + storage +
                " ]";
    }
}
