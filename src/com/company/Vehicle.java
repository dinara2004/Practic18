package com.company;

public abstract class Vehicle {
    private String modeOfVehicles;
    private String name;
    private double volume;
    private double speed;

    public Vehicle() {
    }

    public Vehicle(String modeOfVehicles, String name, double volume, double speed) {
        this.modeOfVehicles = modeOfVehicles;
        this.name = name;
        this.volume = volume;
        this.speed = speed;
    }

    public String getModeOfVehicles() {
        return modeOfVehicles;
    }

    public void setModeOfVehicles(String modeOfVehicles) {
        this.modeOfVehicles = modeOfVehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public abstract void helpful();

    }

