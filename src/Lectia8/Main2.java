package Lectia8;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] x = {100, 99, 77, 24, random.nextInt(100)};

        System.out.println("Care numar doriti sa il gasim = ");
        int y = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == y) {
                System.out.println("Elementul a fost gasit la indexul " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Numarul nu a fost gasit");
        }
    }
}