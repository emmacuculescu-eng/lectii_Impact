package Lectia5;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        System.out.println(sumaCifrelor());
    }

    public static int sumaCifrelor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Numar = ");
        int nr = input.nextInt();
        int suma = 0;
        while(nr!=0){
            suma += nr%10;

            nr /=10;
        }
        return suma;
    }

    // 4! = 4*3*2

    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
