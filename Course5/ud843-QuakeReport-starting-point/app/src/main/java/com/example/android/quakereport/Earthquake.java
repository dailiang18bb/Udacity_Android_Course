package com.example.android.quakereport;

public class Earthquake {

    private String place;
    private double magnitude;
    private long time;
    private String url;


    public Earthquake(String place, double magnitude, long time, String url) {
        this.place = place;
        this.magnitude = magnitude;
        this.time = time;
        this.url = url;
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

    public String getUrl() {
        return url;
    }
}
