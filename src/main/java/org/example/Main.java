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
               String text = "    jak nauczyc sie programowania   ";
               text = text.strip().toUpperCase();
//                text = text.strip().toUpperCase().substring(4);

               String[] words = text.split(" ", 2);
               String res = words.length > 1 ? words[1] : "";
                System.out.println(res);

               }
////               text = text.replace(" ", "+");
//               int lenght = text.length();
//               text = text.strip();
//                System.out.println(text);
//                System.out.println(lenght);
//                boolean startWithI = text.startsWith("I");
//                boolean endsWithY = text.endsWith("y");
//                System.out.println(startWithI);
//                System.out.println(endsWithY);



            }







