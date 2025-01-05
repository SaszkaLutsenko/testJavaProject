package org.example;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        /*

        byte num = 10;
        System.out.println("byte:" + num);

        short num1 = 200;
        System.out.println("short :" + num1);

        int num2 = 50000;
        System.out.println("int :" + num2);

        long num3 = 100000;
        System.out.println("long :" + num3);

        float num4 = 5.5f;
        System.out.println("float :" + num4);

        double num5 = 10.1234d;
        System.out.println("double :" + num5);

        char text = 'A';
        System.out.println("char :" + text);

        boolean boo = true;
        System.out.println("boolean :" + boo);


  Scanner scan = new Scanner(System.in);

       // String userText = scan.nextLine();
        System.out.println("Enter first number;");
        int num1 = scan.nextInt();

        System.out.println("Enter second number;");
        int num2 = scan.nextInt();

        System.out.println("my number is" + (num1 + num2));

розрахувати радіус
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius :");
        double s, r = scan.nextDouble();
        s = Math.PI * r * r;
        System.out.println( "S =" + s);

розрахувати кількість секунд в заданій кількості днів
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of days :");
        int s, d = scan.nextInt();
        s = d * 24 * 60 * 60;

        System.out.println( "S =" + s);

        середнє арефметичне
         Scanner scan = new Scanner(System.in);


        System.out.println("Enter first num :");
        int num1 = scan.nextInt();

        System.out.println("Enter second num :");
        int num2 = scan.nextInt();

        System.out.println("Enter third num :");
        int num3 = scan.nextInt();

        double num = (num1 + num2 + num3)/3;

        System.out.println( "S =" + num);



        оператор if else

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your number");
         int num = scan.nextInt();
         if (num == 5) {
             System.out.println("You won!");
         } else System.out.println("Try one more!");

         калькулятор

           Scanner scan = new Scanner(System.in);
         System.out.println("Enter first number");
         int num1 = scan.nextInt();

         System.out.println("Enter second number");
         int num2 = scan.nextInt();

         System.out.println("Enter math sym( + - / *)");
         scan.nextLine();
         char sym = scan.nextLine().charAt(0);


        switch (sym){
            case '+': System.out.println("Your number is " + (num1 + num2));
            break;
            case '-': System.out.println("Your number is " + (num1 - num2));
            break;
            case '/': if(num2 == 0){
                System.out.println("try one more");
            } else {
                System.out.println("Your number is " + (num1 / num2));
            }
                break;
            case '*': System.out.println("Your number is " + (num1 * num2));
                break;
            default:    System.out.println("try one more");
        }
    }
}

перівняння двох чисел
 Scanner scan = new Scanner(System.in);
         System.out.println("Enter first number");
         int num1 = scan.nextInt();

         System.out.println("Enter second number");
         int num2 = scan.nextInt();

         if( num1 > num2 ){
             System.out.println("first number more done");
         } else if (num1 < num2 ) {
             System.out.println(("second number more done"));
         } else if (num1 == num2) {
             System.out.println("numbers is eqaule");

         }

    }
}

         визнчити пору року за місяцем
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of mount");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("It is winter");
                break;
            case 2:
                System.out.println("It is winter");
                break;
            case 3:
                System.out.println("It is spring");
                break;
            case 4:
                System.out.println("It is spring");
                break;
            case 5:
                System.out.println("It is spring");
                break;
            case 6:
                System.out.println("It is summer");
                break;
            case 7:
                System.out.println("It is summer");
                break;
            case 8:
                System.out.println("It is summer");
                break;
            case 9:
                System.out.println("It is autumn");
                break;
            case 10:
                System.out.println("It is autumn");
                break;
            case 11:
                System.out.println("It is autumn");
                break;
            case 12:
                System.out.println("It is winter");
                break;
            default:
                System.out.println("try number 1-12");
        }

    }
}

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of mount");
        int num = scan.nextInt();



        if (num >= 90 && num <= 100) {
            System.out.println("A");
        } else if (num <= 89 && num >= 80  ) {
            System.out.println("B");
        } else if (num <= 79 && num >= 70  ) {
            System.out.println("c");
        } else if (num <= 69 && num >= 60  ) {
            System.out.println("d");
        } else if (num <= 59) {
            System.out.println("f");
        }

    }
}




