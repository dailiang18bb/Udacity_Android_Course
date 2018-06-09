package com.example.android.quakereport;

public class Earthquake {

    private String place;
    private double magnitude;
    private long time;


    public Earthquake(String place, double magnitude, long time) {
        this.place = place;
        this.magnitude = magnitude;
        this.time = time;
    }


    public String getPlace() {
        return place;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public long getTime() {
        return time;
    }
}
