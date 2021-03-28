package com.homework.chapters.four;

public class ChapterFourMain {
    public static void main(String[] args) {
        // 2 exercise
        LabeledPoint labeledPoint = new LabeledPoint("think", 12 ,2);
        System.out.println(labeledPoint.toString());
        // 4 exercise
        Rectangle rectangle = new Rectangle(new Point(1,2),12, 15);
        System.out.println(rectangle.toString());
        rectangle.moveBy(2,4);
        System.out.println(rectangle.toString() +"\n");
        //5 exercise
        try {
            Rectangle rectangleClone = (Rectangle) rectangle.clone();
            rectangleClone.moveBy(5,4);
            System.out.println("Клонируемый: " + rectangle.toString());
            System.out.println("Клон: " + rectangleClone.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //6 exercise
        System.out.println(Colors.GREEN.getHexColor());
    }
}
