package org.example;

public class Animals {

    public String Speack(){
        String info = "animals speaks";
        return info;
    }
    protected String name;

    public void setName(String name){
        this.name = name;
        System.out.println("name is " + name);
    }

    public void processPayment(){
        System.out.println("wait for payment");
    }
}
