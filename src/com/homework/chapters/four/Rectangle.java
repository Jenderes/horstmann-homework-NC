package com.homework.chapters.four;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        try {
            Rectangle cloneRectangle = (Rectangle) super.clone();
            cloneRectangle.point = new Point(point.getX(),point.getY());
            return cloneRectangle;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", point=" + point +
                '}';
    }
}
