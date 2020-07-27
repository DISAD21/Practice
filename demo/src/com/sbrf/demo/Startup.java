package com.sbrf.demo;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Startup {


        public static void main(String[] args) {
/* 1 задача
            System.out.println("Hello World!");
*/
/* 2 задача
            int a = 21;
            int b = 2;
            int c = a/b;
            int d = a%b;
            System.out.println(a + " / " + b + " = " + c + " и " + d + " в остатке");
*/
/* 3 задача
     boolean weekday = false;
     boolean vacation = true;
     boolean Sleep;
        if(!weekday && vacation) {
            Sleep = true;
        } else
            Sleep = false;
            System.out.println("Спать = " + Sleep);
        }
*/
/* 4 задача
            String  a;
        Scanner in = new Scanner(System.in);
        System.out.println("введите строку:");
        a = in.nextLine();
        boolean flag = true;
        for(int i=0;i<a.length()/2;i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if(flag==true) {
            System.out.print("палиндром");
        } else {
            System.out.print("не палиндром");
        }
*/
/* 5 задача
            int n = 123;
            int a = (n%10)+((n/10)%10)+((n/100)%10);
            System.out.println("Сумма цифр числа " + n +" равна " + a);
*/
/* 6 задача
            Scanner in = new Scanner(System.in);
            System.out.println("Введите вес на земле");
            int a = in.nextInt();
            int b = ((17*a)/100);
            System.out.println("С весом в " + a + "кг ваш вес на луне будет равен " + b);
*/
/* 7 задача
            System.out.print("Вводите ваше натуральное число - ");
            Scanner sr = new Scanner(System.in);
            int n = sr.nextInt();
            System.out.print("Число " + n + " делится на - " );
            int d = 0;
            for(int i = 1; i <= n; i++){
                if ((n % i) == 0){
                    d++;
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nКоличество делителей - " + d);
*/
/* 8 задача
            int x;
            Scanner scn=new Scanner(System.in);
            System.out.println("Введите натуральное число");
            if(scn.hasNextInt()){
                x=scn.nextInt();
                for(int i=(int)Math.sqrt(x);i>=1;i--){
                    if(x%i==0&i!=1){
                        System.out.println("Заданное число - составное");
                        break;
                    }
                    if(i==1) System.out.println("Заданное число простое");
                }
            }
            else System.out.println("Ошибка. Введено не число");
*/
/* 9 задача
            int a, b;
            boolean i;
            for(a=2; a < 100; a++) {
                i = true;
                for (b=2; b <= a/b; b++)
                    if((a%b) == 0) i = false;
                if (i)
                    System.out.println(a + " - простое число.");
            }
*/
/* 10 задача
            Scanner scn=new Scanner(System.in);
            System.out.println("Введите натуральное число");
            int n;
            n =scn.nextInt();
            long a = 1;
            long b = 1;
            System.out.println("0 \n1 ");
            for (int i=3; i < n; i++) {
                long c = a+b;
                System.out.println(c + " ");
                a=b;
                b=c;
            }
*/
/* 11 задача
                int a = 1;
                int b = 100;
                System.out.println((int)(Math.random()*((b+1)-a)+a));
*/
/* Задача 12
                Scanner in = new Scanner(System.in);
                String s; String lxa;
                int a;
                s = in.nextLine();
                a = in.nextInt();
                lxa = s.substring(0, a) + s.substring(a+1);
                System.out.println(lxa);
*/
/* Задача 13
                Random r = new Random();
                Scanner in = new Scanner(System.in);
                int n;
                System.out.println("Введите размер массива: ");
                n=in.nextInt();
                double[] myArray;
                myArray = new double[n];
                for (int i=0;i<n;i++)
                {
                 myArray[i]=(int) r.nextInt(50);
                }
                int nu=0;
                int a;
                while(nu!=3) {
                        System.out.println("Интерфейс: \n1 - вывести массив; \n2 - увеличить элемент массива на 10%; \n3 - выход");
                        nu = in.nextInt();
                        switch (nu) {
                                case 1:
                                        for (int i = 0; i < n; i++) {
                                                System.out.print(myArray[i] + " ");
                                        }
                                        System.out.println(" ");
                                        break;
                                case 2:
                                        System.out.println("выбериете элемент массива размером " + n + " :");
                                        a = in.nextInt();
                                        myArray[a] =myArray[a] + myArray[a] * 0.1;
                                        break;
                                case 3:
                                        break;
                        }
                }
*/
/* Задача 14
                Scanner sc = new Scanner(System.in);
                char ch = (char) ('a' + new Random().nextInt(26));
                System.out.println(ch);
                System.out.println("Guess the letter!");
                for (char i = 0; i < 26; i++) {
                        char s = sc.next().charAt(0);
                        if (ch == s) {
                                System.out.println("Right");
                                break;
                        } else {
                                System.out.println("try again");
                                if (Character.getNumericValue(ch) > Character.getNumericValue(s)) {
                                        System.out.println("You’re too low");
                                } else if (Character.getNumericValue(ch) < Character.getNumericValue(s)) {
                                        System.out.println("You’re too high");
                                }
                        }
                }
 */
        }
}
