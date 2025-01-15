package org.example;

public class Cat extends Animals {
    public String color;

    public void setColor(String color) {
        this.color = color;
        System.out.println("color is " + color);
    }

    @Override
    public String Speack() {
        String info = "meu-meu";
        return info;
    }

    public void Cat(){
        super.name = "kot";
    }

    @Override
    public void processPayment() {
        System.out.println("you pay by PayPal");
    }
}
