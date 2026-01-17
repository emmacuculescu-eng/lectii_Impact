package Lectia6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        divizori(100);


        System.out.print("x = ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();


        int counter = 0;
        int suma = 0;
        int produs = 1;

        for (int num = 2; num <= x; num++) {

            if (estePrim(num)) {
                counter++;//counter += 1; counter = counter + 1;
                suma += num;
                produs *= num;
                System.out.println(num + " este numar prim");
            }
        }
        System.out.println(counter + " Numere prime au fist gasite");
        System.out.println("Suma acestor numere = " + suma);
        System.out.println("Produsul acestor numere =" + produs);

    }

    public static void divizori(int num){
        for(int d = 1; d <= num; d++){
            if(num % d == 0){
                System.out.println(d + "\teste divizorul lui\t" + num);
            }
        }
    }

    public static boolean estePrim(int num){
        if(num < 2){
            return false;
        }
        for (int d = 2; d * d <= num; d++){
            if (num % d == 0) {
                return false;
            }
        }
        return true;


    }
}