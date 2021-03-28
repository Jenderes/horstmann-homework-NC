package com.homework.chapters.two;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
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
     * @param x translate x
     * @param y translate y
     * @return new Point
     */
    public Point translate(double x, double y){
        return new Point(this.x += x, this.y += y);
    }

    /**
     * @param change coefficient
     * @return new Point
     */
    public Point scale(double change) {
        return new Point(this.x *= change, this.y *= change);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
