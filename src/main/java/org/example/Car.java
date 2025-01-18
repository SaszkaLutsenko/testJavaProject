package org.example;

public class Car {
    public String model1;


    class Engine {
       public int horsepower;

        public void printEngineInfo(int horsepower){
            this.horsepower = horsepower;
            System.out.println("engine have " + horsepower + "horsepower");
        }

        public void printCarInfo(String model1){
            Car.this.model1 = model1;
            System.out.println("model this car is " + model1);
        }
    }
}
