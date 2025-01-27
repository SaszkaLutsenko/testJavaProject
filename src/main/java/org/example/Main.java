package org.example;


import java.util.Scanner;

class Main {
            public static void main(String[] args) {

                // i want larn development because i want to start work in it
                // now i watch lesson from youtube , somefeng polish bloger
                // and i watch 11 lessons like 40 minutes and i must write script and save
                // this task at GitHub.

                Scanner scr = new Scanner(System.in);

                System.out.println("what is your name?");
                String proffecion = scr.nextLine();

                System.out.println("where you want work?");
                String work = scr.nextLine();

                System.out.println("where you watch lessons?");
                String platforme = scr.nextLine();

                System.out.println("from what country this blogger?");
                String from = scr.nextLine();

                System.out.println("How mach lessons you see today?");
              byte integerLessons = scr.nextByte();

                System.out.println("where yuo save homework?");
              String platformeForSave = scr.nextLine();

                System.out.println("how mach time you lorn?");
              byte time = scr.nextByte();


                System.out.println("i want larn " + proffecion + "because i want to start work in " + work +
                        " now i watch lesson from " + platforme + " , something "+ from + " blogger" +
                        " and i watch "+ integerLessons +" lessons like " + time + " minutes and i must write script and save" +
                        " this task at " + platformeForSave + ".");

            }};







