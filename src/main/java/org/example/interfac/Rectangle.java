package org.example.interfac;

public class Rectangle implements ISharpe{
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double res = width * height;
        System.out.println(res);
    }

    @Override
    public void calculatePerimeter() {
        double res = width + height;
        System.out.println(res);

    }

}
