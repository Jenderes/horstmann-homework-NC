package com.homework.chapters.four;

import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;
    private double x;
    private double y;


    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0 &&
                Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label, x, y);
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
