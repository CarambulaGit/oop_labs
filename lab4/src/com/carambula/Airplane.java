package com.carambula;

public class Airplane {
    private String model;
    private int cruise;
    private int range;
    private int payload;
    private int volume;

    public Airplane() {
        new Airplane("Unknown", 0, 0, 0, 0);
    }

    public Airplane(String model, int cruise, int range, int payload, int volume) {
        this.model = model;
        this.cruise = cruise;
        this.range = range;
        this.payload = payload;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }


    public int getPayload() {
        return payload;
    }


    @Override
    public String toString() {
        return "Airplane model name: " + model
                + ", cruise: " + cruise
                + "km/h, range: " + range
                + "km, payload: " + payload
                + "kg, volume: " + volume + "m3";
    }
}
