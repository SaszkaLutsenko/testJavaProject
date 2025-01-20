package org.example.pakege;

public class Calculator {
    public static void add(int[] numbers){
        int sum = 0;
        for ( int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }

    public static void add(double a, double b){
        double sum = a + b;
        System.out.println(sum);
    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
}
