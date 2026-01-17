public class Mains

import java.util.Scanner;
import java.util.Random;

public class Lessonc7 {
    public static void main(String[] args) {

        String nume = "Gheorghe";
        String nume2 = "Alexandru cel Bun";
        Scanner input = new Scanner(System.in);

        System.out.print("Your name: ");
        String nume3 = input.next();

        Random rand = new Random();
        int index = rand.nextInt(nume.length());

        System.out.println("Length : " + nume.length());
        System.out.println("First char " + nume.charAt(0));
        System.out.println("Last char(1) " + nume.charAt(nume.length() - 1));
        System.out.println("Last char(2) " + nume2.charAt(nume2.length() - 1));
        System.out.println("Last char(3) " + nume3.charAt(nume3.length() - 1));
        System.out.println("Random char  " + nume.charAt(index));

        System.out.println("nume2 Substring (0,9)" + nume2.substring(0, 9));
        System.out.println("nume2 Substring (10,13)" + nume2.substring(10, 13));
        System.out.println("nume2 Substring (14,17)" + nume2.substring(14, 17));

        System.out.println("UpperCase " + nume2.toUpperCase());
        nume2 = nume2.toUpperCase();
        System.out.println(nume2);
        System.out.println(nume2.toLowerCase());
        System.out.println(nume2);

        System.out.println("Gheorghe".equals(nume));
        System.out.println(nume.equalsIgnoreCase("GhEoRGhE"));

        System.out.println("Index of 'e' " + nume.indexOf("e"));
        System.out.println("Index of 'cel' " + nume2.indexOf("CEL"));

        System.out.println("Replace "+ nume2.replace("BUN", "Mare"));
        System.out.println("Replace "+ nume.replace("e", "i"));
    }
}