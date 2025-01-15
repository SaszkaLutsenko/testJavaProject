package org.example;

import java.util.*;


        class Main {
            public static void main(String[] args) {
                Animals www = new Animals();
                www.setName("piza");
                System.out.println(www.Speack());

                Dog qqq = new Dog();
                qqq.setName("twar");
                qqq.setBreed("alabai");
                System.out.println(qqq.Speack());


                Cat fff = new Cat();
                fff.setName("murka");
                fff.setColor("blue");
                System.out.println(fff.Speack());

                Cow ddd = new Cow();
                System.out.println(ddd.Speack());


            }
        }






