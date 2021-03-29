package com.homework.chapters.three;

import java.util.*;
import java.util.stream.Stream;

public class ChapterThreeMain {
    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee("John", "Lukhard", 1200),
                new Employee("Eilis", "Walker", 3200),
                new Employee("Dorian", "Gray", 5500)
        };

        // 1 exercise
        System.out.println("Средняя зарплата: " + average(employees));

        // 2 exercise
        System.out.println("Имя сотрудника с максимальной зарплатой: " + MeasurableLargest(employees) + "\n");

        // 7 exercise
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("solar", "meeting", "thor"));
        System.out.println(strings);
        luckySort(strings, Comparator.comparing(String::length));
        System.out.println(strings + "\n");

        // 8 exercise
        Greeter greeterFirst = new Greeter(3, "Sam");
        Greeter greeterSecond = new Greeter(3, "Din");
        Thread thread1 = new Thread(greeterFirst);
        Thread thread2 = new Thread(greeterSecond);
        thread1.start();
        thread2.start();
    }

    // 1 exercise
    private static double average(Measurable[] objects) {
        return Stream.of(objects)
                .mapToDouble(Measurable::getMeasure)
                .average()
                .orElse(0);
    }

    // 2 exercise
    private static String MeasurableLargest(Measurable[] objects) {
        Employee employee = (Employee) Stream.of(objects)
                .filter(object -> object instanceof Employee)
                .max(Comparator.comparingDouble(Measurable::getMeasure))
                .get();

        return employee.getFullName();
    }

    // 7 exercise
    private static void luckySort(ArrayList<String> strings, Comparator<String> comparator) {
        boolean flag = true;
        while (flag){
            Collections.shuffle(strings);
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comparator.compare(strings.get(i), strings.get(i + 1)) < 0) {
                    flag = false;
                    break;
                }
            }
        }
    }
}
