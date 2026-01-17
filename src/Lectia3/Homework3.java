package Lectia3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("num1 = ");
        int num1 = input.nextInt();

        System.out.println("num2 = ");
        int num2 = input.nextInt();


        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " +   (num1 - num2));
        System.out.println("num1 * num2 = " +   (num1 * num2));
        System.out.println("num1 / num2 = " +   (num1 / num2));
        System.out.println("num1 % num2 = " +   (num1 % num2));

        System.out.println(" num1 > num2 ? ( " + (num1> num2) + ")");


        System.out.println("age: ");
        int age = input.nextInt();

        System.out.println("Major :" + (age>=18));





        System.out.println("num3 = ");
        int num3 = input.nextInt();

        System.out.println("num3 Odd: (" + (num3%2==0) + ")");


    } }
