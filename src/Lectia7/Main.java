package Lectia7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String secretWord = "Java";
        int tries = 0;
        boolean found = false;
        String inputWord = "_".repeat(secretWord.length());

        System.out.println("_____ Guess the WORD _____");
        System.out.println("The secret word has " + secretWord.length() + "letters");

        while (!found) {
            System.out.println("Enter a latter");
            char guess = Character.toUpperCase(input.next().charAt(0));

            StringBuilder newInput = new StringBuilder(inputWord);
            boolean correct = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) { // Java J == A ? false A == A? true V == A? False A == A
                    newInput.setCharAt(i, guess); // _A_A
                    correct = true;
                }
            }
            if (correct) {
                inputWord = newInput.toString();
                System.out.println("Good guess " + inputWord);
            } else {
                System.out.println("Wrong guess!");
            }
            tries++;

            if (inputWord.equals(secretWord)) {
                found = true;
                System.out.println("Congrats! The word was " + secretWord + "you guessed it in " + tries + "tries");
            }
        }
    }
}