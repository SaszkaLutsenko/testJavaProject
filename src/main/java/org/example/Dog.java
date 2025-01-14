package org.example;

public class Dog extends Animals{
    private String breed;

    public void setBreed(String breed){
        this.breed = breed;
        System.out.println("breed is " + breed);
    }
    @Override
    public void Speack() {
        System.out.println(" wof-wof");
    }
}
