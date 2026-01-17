package Lectia7;

import java.util.Scanner;

public class HW {

/*
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int secretNumber = (int) (Math.random() * 50) + 1;
            int guess = 0;
            int tries = 0;

            System.out.println("_____ Ghiceste numarul _____");
            System.out.println("Incearca sa ghicesti numarul de la 1 la 50");

            while (guess != secretNumber) {
                System.out.print("Introdu numarul: ");
                guess = input.nextInt();
                tries++;

                if (guess < secretNumber) {
                    System.out.println("Prea mic!");
                } else if (guess > secretNumber) {
                    System.out.println("Prea mare!");
                } else {
                    System.out.println("Felicitari! numarul era " + secretNumber +
                            ". Ai ghicit " + tries + " incercari.");
                }
            }
        }

    }
*/
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Introdu cuvintu: ");
//        String word = input.nextLine();
//
//        System.out.println("Literele din acest cuvint sunt:");
//        for (int i = 0; i < word.length(); i++) {
//            System.out.println(word.charAt(i));
//        }
//    }
//}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introdu primu cuvint: ");
        String word1 = input.nextLine();

        System.out.print("Introdu al 2 cuvint: ");
        String word2 = input.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Cuvintele sunt egale!");
        } else {
            System.out.println("cuvintele sunt diferite!");
        }
    }
}