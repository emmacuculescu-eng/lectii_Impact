package Lectia9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //   sumaPare();
        AdaugareElement();

    }

    public static void AdaugareElement(){
        int [] v = new int [100];
        Random random = new Random();

        v[0] = random.nextInt(0,20);
        v[1] = random.nextInt(0,20);
        v[2] = random.nextInt(0,2);
        v[3] = random.nextInt(20,40);
        v[4] = random.nextInt(40,60);
        v[5] = random.nextInt(0,20)*5;

        int n = 6, poz = 1, val = 21;

        for (int i = n; i > poz; i--){
            v[i] = v[i-1];

        }
        v[poz] = val;
        n++;

        for(int i = 0; i<n; i++){
            System.out.println("v[ " + i + "] = " + v[i]);
        }


    }




    public static void eliminareElement(){
        int [] vector = {1, 2, 3, 4, 5, 6};
        int lungimeaVector = 6;
        int pozitiaEliminata = 2;

        for(int i = pozitiaEliminata; i < lungimeaVector - 1; i++){
            vector[i] = vector[i + 1];
        }
        lungimeaVector -= 1;




        for (int i = 0; i < lungimeaVector ; i++) {

            System.out.println("vector[" + i + "]=" + vector[i]);
        }
    }

    public static void sumaPare() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cate elemente vor fi in vector? ");
        System.out.print("n= ");
        int n = input.nextInt();

        int[] v = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("v[" + i + "] = ");
            v[i] = input.nextInt();
            if(v[i] % 2 == 0) {
                suma += v[i];
            }
        }

        System.out.println("Suma elementelor pare = " + suma);

    }
}