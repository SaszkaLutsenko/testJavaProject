package org.example;

public class Person {
    public String name;
    public int age;
    private String lastName;

    public Person(String name, int age, String lastName){
            this.name = name;
            this.age = age;
            this.lastName = lastName;
        System.out.println(displayInfo());
    }
    public Person (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        System.out.println(displayInformation());
    }
    public Person(){
        this.name = "unknown";
        this.age = 0;
        this.lastName = "unknown";
        System.out.println(displayInfo());
    }

    public String displayInfo(){
        String info = "This person have name " + name +" " + lastName + " and have " + age + " age";
    return info;
    }
    public String displayInformation(){
        String info = "This person have name " + name +" " + lastName ;
        return info;
    }

}
