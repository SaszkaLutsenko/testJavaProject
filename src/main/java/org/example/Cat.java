package org.example;

public class Cat extends Animals {
    public String color;

    public void setColor(String color) {
        this.color = color;
        System.out.println("color is " + color);
    }
    @Override
    public void Speack() {
        System.out.println("meu-meu");
    }

    public void Cat(){
        super.name = "kot";
    }
}
