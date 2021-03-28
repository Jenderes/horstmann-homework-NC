package com.homework.chapters.four;

abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy (double dx, double dy){
        point.x += dx;
        point.y += dy;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "point=" + point +
                '}';
    }
}
