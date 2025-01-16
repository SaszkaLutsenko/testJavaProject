package org.example;

public abstract  class Animals {

    public String Speack(){
        String info = "animals speaks";
        return info;
    }
    protected String name;

    public void setName(String name){
        this.name = name;
        System.out.println("name is " + name);
    }
    public  Legs legs = new Legs();

    public abstract void legs(boolean b, int i);

    class Legs {
        boolean horns;
        boolean legs;
        int numberLegs;

        public void legs(boolean horns, boolean legs, int numberLegs){
        this.legs = legs;
        this.numberLegs = numberLegs;
        infoAboutHorns();

        }

        public void infoAboutHorns(){
            if(horns) System.out.println("this animal have " + numberLegs + " legs");
            else System.out.println("this animal didn't have legs");
        }
    }

    public abstract void processPayment();

    public void getInfo(){
        System.out.println("шо ти голова?");
    }

}
