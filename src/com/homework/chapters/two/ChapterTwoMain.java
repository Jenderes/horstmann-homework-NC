package com.homework.chapters.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import static com.homework.chapters.two.RandomNumbers.randomElement;

public class ChapterTwoMain{
    public static void main(String[] args) {

        // 5 exercise
        System.out.println(new Point(3,4).translate(1 ,3).scale(0.5).toString() + "\n");

        // 6 exercise
        System.out.println(new PointModifier(2,3).translate(1 ,5).scale(2).toString() + "\n");

        // 9 exercise
        System.out.println(new Car(3).addFuel(13).move(6).toString() + "\n");

        //10 exercise
        System.out.println("Массив: " + randomElement(new int[]{1,2,3,4,5,6,7,8}));
        System.out.println("Список: " + randomElement(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8))));
        System.out.println("Пустой массив: " + randomElement(new int[]{}));
        System.out.println("Пустой список: " + randomElement(new ArrayList<Integer>(Collections.emptyList())) + "\n");

    }
}
