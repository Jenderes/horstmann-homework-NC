package com.homework.chapters.two;

public class PointModifier {
    private double x;
    private double y;

    public PointModifier() {
        this.x = 0;
        this.y = 0;
    }

    public PointModifier(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    /**
     * @param x translate position x
     * @param y translate position y
     * @return  this PointModifier
     */
    public PointModifier translate(double x, double y){
        this.x += x;
        this.y += y;
        return this;
    }

    /**
     * @param change coefficient
     * @return this PointModifier
     */
    public PointModifier scale(double change) {
        this.x *= change;
        this.y *= change;
        return this;
    }

    @Override
    public String toString() {
        return "PointModifier{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
