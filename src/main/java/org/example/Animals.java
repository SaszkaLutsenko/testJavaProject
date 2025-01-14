package org.example;

public class Animals {

    public void Speack(){
        System.out.println("i am a animal");
    }
    protected String name;

    public void setName(String name){
        this.name = name;
        System.out.println("name is " + name);
    }
}
