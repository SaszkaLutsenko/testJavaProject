package org.example.st;

public class StaticClass {
    public static void squere(int x){
        int res = x * x;
        System.out.println(res);
    }
    public static void cube(int x){
        int res = x * x * x;
        System.out.println(res);
    }
    public static void factorial(int x){
        int res = 1;
        for(int i = 1; i <= x; i++){
            res *= i;
        }
        System.out.println(res);

    }
}
