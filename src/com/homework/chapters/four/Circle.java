package com.homework.chapters.four;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point point, double radius) {
        super(point);
       this.radius = radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        try {
            Circle cloneCircle = (Circle) super.clone();
            cloneCircle.point = new Point(point.getX(), point.getY());
            return cloneCircle;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", point=" + point +
                '}';
    }
}
