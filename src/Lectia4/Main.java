package Lectia4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int zi = 100; zi <=7; zi++){
            System.out.println("Este ziua "+ zi);
        }

        int zi = 100;
        while(zi <= 7){
            System.out.println("Este ziua nr = " + zi);
            zi++;
        }

        int zi2 = 1;

        do{
            System.out.println("Este ziua nr = " + zi2);
            zi2++;
        }while(zi2<=7);


        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();


        int i = 1;
        while (i<=n){
            System.out.println("i = " + i);
            i++;
        }


        int  x, nr = 0;
        System.out.println("Introdu numarul: ");
        x = sc.nextInt();
        int y = x;

        while(x!=0){
            nr++;
            x = x/10;
        }

        System.out.println(y + " are " + nr + " cifre");


        String name = "Andrei";

        System.out.println(name.equals("Andrei"));


        int nr1 = sc.nextInt();
        int nr2 = nr1;
        nr1++; //   int nr2 = nr1++;

        int nr3 = sc.nextInt();
        nr3++;
        int nr4 = nr3; // int nr4 = ++nr3;


        System.out.println("Nr1 =" + nr1);
        System.out.println("Nr2 =" + nr2);
    }
}