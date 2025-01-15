package org.example;

public class Dog extends Animals{
    private String breed;

    public void setBreed(String breed){
        this.breed = breed;
        System.out.println("breed is " + breed);
    }

    @Override
    public String Speack() {
        String info = "wof-wof";
        return info;
    }

    @Override
    public void processPayment() {
        System.out.println("you pay by credit card");
    }
}
