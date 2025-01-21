package org.example.interfac;

public class Circle implements ISharpe{
    public double radius;

    public  Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double res = Math.PI * radius * radius;
        System.out.println(res);
    }

    @Override
    public void calculatePerimeter() {
        double res = 2 * Math.PI * radius;
        System.out.println(res);

    }
}
