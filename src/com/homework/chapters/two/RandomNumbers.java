package com.homework.chapters.two;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static int randomElement(int[] array) {
        Random random = new Random();
        return  array.length != 0 ? array[random.nextInt(array.length)] : 0;
    }

    public static int randomElement(ArrayList<Integer> arrayList) {
        Random random = new Random();
        return arrayList.size() != 0 ? arrayList.get(random.nextInt(arrayList.size())) : 0;
    }
}
