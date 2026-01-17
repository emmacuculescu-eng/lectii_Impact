package Lectia9;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {



        int[] v = new int[10];

        problema1();


    }

    public static void problema1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cate elemente vor fi in vector? ");
        System.out.print("n= ");
        int n = input.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("v[" + i + "] = ");
            v[i] = input.nextInt();
        }

        System.out.println("v[0]=" + v[0]);
        System.out.println("v[n-1]=" + v[n-1]);

        for (int i = 0; i < n; i++) {
            System.out.println("v[" + i + "] = " + v[i]);
        }
    }

    public static void problema2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cate elemente vor fi in vector? ");
        System.out.print("n= ");
        int n = input.nextInt();

        int[] v = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("v[" + i + "] = ");
            v[i] = input.nextInt();
            suma += v[i];
        }

        System.out.println("Suma elementelor = " + suma);

    }

    public static void problema3() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cate elemente vor fi in vector? ");
        System.out.print("n= ");
        int n = input.nextInt();

        int[] v = new int[n];
        int min;
        int max;

        for (int i = 0; i < n; i++) {
            System.out.print("v[" + i + "] = ");
            v[i] = input.nextInt();
        }

        min = v[0];
        max = v[0];

        for (int i = 0; i < n; i++) {
            if (v[i] < min) min = v[i];
            if (v[i] > max) max = v[i];
        }

        System.out.println("valoare maxima = " + max);
        System.out.println("valoare minima = " + min);
    }


    public static void problema4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cate elemente vor fi in vector? ");
        System.out.print("n= ");
        int n = input.nextInt();

        int[] v = new int[n];
        int min;
        int max;

        for (int i = 0; i < n; i++) {
            System.out.print("v[" + i + "] = ");
            v[i] = input.nextInt();
        }

        System.out.print("Introduceti valoarea care urmeaza sa fie gasita = ");
        int findNum = input.nextInt();

        for (int i = 0; i < n; i++) {
            if(v[i] == findNum){
                System.out.println("Elementul a fost gasit la indexul " + i);
                break;
            }
        }
    }
}