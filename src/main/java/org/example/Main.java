package org.example;

import java.util.*;


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
таблиця множення для заданого числа
Scanner scan = new Scanner(System.in);
System.out.println("Enter number for the table");
int a = scan.nextInt();
for (int i = 1; i <=10; i++) {
  System.out.println(a+"x"+i+"="+ (a * i));


  гра відгадай число
    class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int t = (int)(Math.random() * 100) + 1;
int n;
do {
  System.out.println("Enter number 1-100");
  n = scan.nextInt();

  if (n > t) {
      System.out.println("your number is smaller");
  } else if (n < t) {
      System.out.println("your number is bigger");
  } else {
      System.out.println("you are a winner!");
  }}
  while (n != t);
        scan.close();
    }
}
}

game
Scanner scan = new Scanner(System.in);
int t = (int)(Math.random() * 100) + 1;
int n;
do {
  System.out.println("Enter number 1-100");
  n = scan.nextInt();

  if (n > t) {
      System.out.println("your number is smaller");
  } else if (n < t) {
      System.out.println("your number is bigger");
  } else {
      System.out.println("you are a winner!");
  }}
  while (n != t);
        scan.close();x

        масиви


      Scanner scan = new Scanner(System.in);
//                int userNumber = scan.nextInt();
        int[][] numbers = new int[3][3];
        Random random = new Random();
//                int sumNumber = 0;



        for (int i = 0; i < numbers.length; i ++ ){
            for (int j = 0; j < numbers.length; j ++ ){
                numbers[i][j] = random.nextInt(10) + 1;
                System.out.print( numbers[i][j] + "\t");

            }
            System.out.println();
        }
        for (int i = 0; i < numbers.length; i ++ ){
            int sumLine = 0;
            for (int j = 0; j < numbers.length; j ++ ){
            sumLine += numbers[i][j];
                }
            System.out.println("sum line number "+ (i + 1) + " is "+ sumLine);
        }

        for (int j = 0; j < numbers.length; j ++ ){
            int sumCollum = 0;
            for (int i = 0; i < numbers.length; i ++ ){
                sumCollum += numbers[i][j];
            }
            System.out.println("sum column number "+ (j + 1) + " is "+ sumCollum);
        }



//                Arrays.sort(numbers);

//                for(byte i = 0; i < numbers.length; i++){
//                    System.out.println("Enter element" + i + ":");
//                    numbers[i] = scan.nextInt();
//                }
//                for(byte i = 0; i < numbers.length; i++)
//                    System.out.print(numbers[i] + " ");

//                for( byte i = 0; i < numbers.length; i++){
//
//                    if(maxNumber < numbers[i]){
//                        maxNumber = numbers[i];
//
//                    }
//                    if(minNumber > numbers[i]){
//                        minNumber = numbers[i];
//                    }
//                }

колекціі
ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(60);
        int numbers1 = 50;
        numbers.add(numbers1);
        numbers.add(1, 77);
        numbers.remove(0);
        numbers.isEmpty();
        numbers.set(0, 99);
        Integer[] num2 = (Integer[])numbers.toArray();
//                for(int num : numbers){}
            System.out.println(num2);

 */
        class Main {
            public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(11);
                numbers.add(12);
                numbers.add(34);
                numbers.add(54);
                numbers.add(23);
                numbers.add(12);
                numbers.add(53);
                numbers.add(99);
                numbers.add(34);
                numbers.add(16);

                int q = 0;

                for(int num : numbers){

                    if(num > q) q = num ;
                }
                System.out.println(q);


            }
                }






