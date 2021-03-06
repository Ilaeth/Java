package com.company.devices;
public abstract class Device {
    public final String model;
    public final String producer;
    public final Integer yearofproduction;
    public Double value;

    public Device(String model, String producer, Integer yearofproduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearofproduction = yearofproduction;
        this.value = value;
    }

    public Device(String model, String producer, Integer yearofproduction) {
        this.model = model;
        this.producer = producer;
        this.yearofproduction = yearofproduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearofproduction=" + yearofproduction +
                '}';
    }
    public abstract void turnOn();
}