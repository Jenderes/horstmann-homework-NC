package com.homework.chapters.one;

import java.math.BigInteger;
import java.util.*;

public class ChapterOneMain {
    public static void main(String[] args) {

        // 1 exercise
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целоцичсленное значение: ");
        int number = in.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Hexadecimal float point: " + Float.toHexString(number) + "\n");

        // 2 exercise
        System.out.print("Введите значение угла: ");
        int angle = in.nextInt();
        int correctAngle = angle % 360;

        System.out.println("Корректирование значение угла 1ый вариант: " + (correctAngle < 0 ? correctAngle += 360 : correctAngle));
        System.out.println("Корректирование значение угла 2ой вариант: " + Math.floorMod(angle, 360) + "\n");

        // 3 exercise
        System.out.print("Введите 3 целоцичсленных значения через пробел: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max;

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.println("Максимальное значение 1й вариант: " + max);
        System.out.println("Максимальное значение 2й вариант: " + (Math.max(a, Math.max(b, c))) + "\n");

        // 4 exercise
        System.out.println("Манимальное положительное значение Double: " + Math.nextUp(0.0));
        System.out.println("Максимальное положительное значение Double: " + Double.MAX_VALUE + "\n");

        // 6 exercise
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 2; i <= 1000; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Факториал тысячи равен: " + fact + "\n");

        // 7 exercise
        System.out.print("Введите первое целоцичсленное значение: ");
        int num = in.nextInt();
        System.out.print("Введите второе целоцичсленное значение: ");
        int num2 = in.nextInt();

        System.out.println("Сумма: " + (num+num2));
        System.out.println("Разность: " + (num-num2));
        System.out.println("Произведение: " + (num*num2));
        System.out.println("Деление: " + (num/num2));
        System.out.println("Остаток: " + (num%num2) + "\n");

        // 8 exercise
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String[] arrayStr = str.split("\\s+");
        System.out.println("Не пустые подстроки: ");
        for (String el: arrayStr){
            System.out.println(el);
        }
        System.out.println("");

        // 13 exercise
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 49; i++){
            numbers.add(i+1);
        }
        int randNumber;
        System.out.print("Рандомные значения: ");
        for (int i = 0; i < 6; i++){
            randNumber = random.nextInt(numbers.size());
            System.out.print(numbers.get(randNumber)+" ");
            numbers.remove(randNumber);
        }
        System.out.println("");

        // 14 exercise
        System.out.println("Введите матрицу: ");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        String rowMatrix = in.nextLine();
        while (rowMatrix.length() != 0){
            String[] numbStr = rowMatrix.split(" ");
            ArrayList<Integer> row = new ArrayList<>();
            for (String s : numbStr) {
                row.add(Integer.parseInt(s));
            }
            matrix.add(row);
            rowMatrix = in.nextLine();
        }
        boolean flag = true;
        int sum = 0;
        for (int i = 0; i < matrix.size(); i++){
            sum += matrix.get(0).get(i);
        }
        int sumColumn = 0;
        int sumRow = 0;
        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix.size(); j++){
                sumColumn += matrix.get(i).get(j);
                sumRow += matrix.get(j).get(i);
            }
            if (sumColumn != sum || sumRow != sum) {
                System.out.println("Не магический квадрат");
                flag = false;
                break;
            }
            sumColumn = 0;
            sumRow = 0;
        }
        if (flag){
            System.out.println("Магический квадрат");
        }
        // 15 exercise
        System.out.print("Введите n: ");
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> trianglePascal = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                row.add(TrianglePascaleCoefficient(j,i));
            }
            trianglePascal.add(row);
        }
        for (ArrayList<Integer> row : trianglePascal){
            for (Integer elem: row){
                System.out.print(elem+" ");
            }
            System.out.println("");
        }
    }
    private static int TrianglePascaleCoefficient(int k, int n) {
        int result = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i)
        {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
