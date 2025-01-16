package org.example;

import java.util.*;


        class Main {
            public static void main(String[] args) {
                Cat www = new Cat();
                www.setName("piza");
                www.getInfo();
                www.legs(true, 4);

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






