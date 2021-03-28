package com.homework.chapters.four;

public class Line extends Shape implements Cloneable {
    private Point to;
    public Line(Point from,  Point to) {
        super(from);
        this.to = to;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        try {
            Line cloneLine = (Line) super.clone();
            cloneLine.point = new Point(point.getX(),point.getY());
            cloneLine.to = new Point(to.getX(),to.getY());
            return cloneLine;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Line{" +
                "to=" + to +
                ", from=" + point +
                '}';
    }
}
