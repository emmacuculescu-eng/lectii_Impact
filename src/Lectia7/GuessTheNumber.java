package Lectia7;

import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();


        int guess = 0;
        int tries= 0 ;
        int secretNum = rand.nextInt(100)+ 1;

        System.out.println("____Guess the Number____");
        System.out.println("Number is between 1 and 100");


        while(guess != secretNum){
            System.out.println("Enter your guess:");
            guess = input.nextInt();
            tries++;
            if (guess > 100 || guess < 0) {
                System.out.println("Number cannot be smaller than 1 or grater than 100");
            }
            else if(guess < secretNum){
                System.out.println("Too small!");
                System.out.println("Try again!");
            }else if (guess> secretNum){
                System.out.println("Too big!");
                System.out.println("Try again!");
            } else{
                System.out.println("Correct! The number was" + secretNum);
                System.out.println("You find it in" +  tries + "tries");
            }
        }

        input.close();
    }

}