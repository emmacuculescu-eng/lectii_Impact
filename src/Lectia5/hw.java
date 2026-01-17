package Lectia5;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;

//            i+=2;
        }

        Scanner input = new Scanner(System.in);
        int numar;
        do {
            System.out.println("numar=");
            numar = input.nextInt();
        } while (numar != 0);


        for ( i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}