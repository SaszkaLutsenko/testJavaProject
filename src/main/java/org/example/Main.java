package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


class Main {
            public static void main(String[] args) {
                Scanner scr = new Scanner(System.in);

//                System.out.println("Enter first name :");
//                String firstName = scr.nextLine();
//
//                System.out.println("Enter second name : ");
//                String secondName = scr.nextLine();
//
//                System.out.println("How old you are?");
//                byte age = scr.nextByte();
//
//                System.out.println("Hello " + firstName + " " + secondName + " you have " + age + " year.");

//                System.out.println("Enter number a :");
//                int a = scr.nextInt();
//
//                System.out.println("Enter number b :");
//                int b = scr.nextInt();
//                scr.nextLine();
//
//                System.out.println("Enter symbol ( +, -, *, /) :");
//                String symbol = scr.nextLine();
//
//                if(symbol.equals("+")) {
//                    int res = a + b;
//                    System.out.println(res);
//                } else if (symbol.equals("-")) {
//                    int res = a - b;
//                    System.out.println(res);
//                } else if (symbol.equals("*")) {
//                    int res = a * b;
//                    System.out.println(res);
//                } else if (symbol.equals("/") && b != 0) {
//                    int res = a / b;
//                    System.out.println(res);
//                };
//
//               String text = "    jak nauczyc sie programowania   ";
//               text = text.strip().toUpperCase();
////                text = text.strip().toUpperCase().substring(4);
//
//               String[] words = text.split(" ", 2);
//               String res = words.length > 1 ? words[1] : "";
//                System.out.println(res);
//
//               }
////               text = text.replace(" ", "+");
//               int lenght = text.length();
//               text = text.strip();
//                System.out.println(text);
//                System.out.println(lenght);
//                boolean startWithI = text.startsWith("I");
//                boolean endsWithY = text.endsWith("y");
//                System.out.println(startWithI);
//                System.out.println(endsWithY);
                Scanner scaner = new Scanner(System.in);
                System.out.println("What color(red, yellow, green?");
                String color = scaner.nextLine();

                switch (color){
                    case "red" -> System.out.println("stop");
                    case "yellow" -> System.out.println("wait");
                    case "green" -> System.out.println("run");
                    default -> System.out.println("dont know this color");
                }

                int i = 0;
                while (i < 10){
                    System.out.println("write");
                    i++;
                }

//                System.out.println("What is your name?");
//                String name = scaner.nextLine();
//
//                if(color.equals("red") && name.endsWith("a")){
//                    System.out.println("stop, madame");
//                } else if (color.equals("red") && !name.endsWith("a")) {
//                    System.out.println("stop, mister");
//                } else if (color.equals("yellow") && name.endsWith("a")){
//                    System.out.println("wait, madame");
//                } else if (color.equals("yellow") && !name.endsWith("a")) {
//                    System.out.println("wait, mister");
//                }  else if(color.equals("green") && name.endsWith("a")){
//                    System.out.println("run, madame");
//                } else if (color.equals("green") && !name.endsWith("a")) {
//                    System.out.println("run, mister");}
//                else{
//                    System.out.println("i dont know this color?");
//                }
            }}













