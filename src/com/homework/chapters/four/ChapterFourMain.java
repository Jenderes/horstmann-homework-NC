package com.homework.chapters.four;

public class ChapterFourMain {
    public static void main(String[] args) {

        // 2 exercise
        LabeledPoint labeledPoint = new LabeledPoint("think", 1 ,2);
        System.out.println(labeledPoint.toString() + "\n");

        // 4 exercise
        Rectangle rectangle = new Rectangle(new Point(1,2),12, 15);
        System.out.println(rectangle.toString());
        rectangle.moveBy(2,4);
        rectangle.getCenter();
        System.out.println("Передвинутая точка: " + rectangle.toString());
        System.out.println("Точка центра треугольника: " + rectangle.getCenter().toString() +"\n");

        //5 exercise
        try {
            Rectangle rectangleClone = rectangle.clone();
            rectangleClone.moveBy(5,4);
            System.out.println("Клонируемый: " + rectangle.toString());
            System.out.println("Клон: " + rectangleClone.toString() + "\n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //7 exercise
        System.out.println("HEX зеленого цвета: " + Colors.GREEN.getHexColor());
    }
}
