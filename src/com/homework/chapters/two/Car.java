package com.homework.chapters.two;

public class Car {
    private double fuel;
    private double position;
    private final double consumptionFuel;

    public  Car(double consumptionFuel) {
        this.fuel = 0;
        this.position = 0;
        this.consumptionFuel = consumptionFuel;
    }
    public Car move(double position){
        this.position += Math.min(this.fuel * consumptionFuel, position);
        this.fuel = Math.max(0,fuel - (position/consumptionFuel));
        return this;
    }

    public Car addFuel(double fuel) {
        this.fuel = fuel;
        return this;
    }

    public double getFuel() {
        return fuel;
    }

    public double getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", position=" + position +
                ", consumptionFuel=" + consumptionFuel +
                '}';
    }
}
