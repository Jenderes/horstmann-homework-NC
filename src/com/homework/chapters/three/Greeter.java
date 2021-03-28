package com.homework.chapters.three;

public class Greeter implements Runnable {
    private int count;
    private String target;

    public Greeter(int count, String target) {
        this.count = count;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++){
            System.out.println("Hello, " + target);
        }
    }
}
