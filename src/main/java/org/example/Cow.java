package org.example;

public class Cow extends Animals{
    @Override
    public String Speack() {
        String info = "moo-moo";
        return info;
    }

    @Override
    public void processPayment() {
        System.out.println("you pay by stone");
    }

    @Override
    public void legs(boolean b, int i) {
        System.out.println("ooo");
    }
}
