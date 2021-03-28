package com.homework.chapters.three;

public class Employee implements Measurable {
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public Employee(int salary) {
        this.firstName = "John";
        this.lastName = "Smith";
        this.salary = salary;
    }
    @Override
    public double getMeasure() {
        return salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return firstName +" "+ lastName;
    }
}
