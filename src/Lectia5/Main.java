package Online1.lectia5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        salut();
        System.out.println();

        int rezultat = fibonacci(5);
        System.out.println(rezultat);
//        System.out.println(fibonacci(rezultat));


        Scanner input = new Scanner(System.in);
        System.out.print("x= ");
        int x = input.nextInt();
        int originalNum = x;
        int y = 0;
        while (x!=0){
            y = y * 10 + x % 10;
            System.out.print(y + " ");
            x /= 10;
        }


        if(y == originalNum)
            System.out.println("Numarul introdus este un polindrom");
        else
            System.out.println("Numarul introdus nu este un polindrom");


        System.out.println(doubleNumber(y));

        forFunction(0, 100);
        System.out.println();
        forFunction(100, 200);
        System.out.println();
        forFunction(10, 0);


    }

    static int doubleNumber(int number){
        return number*2;
    }
    static void forFunction(int start, int stop){
        if(start < stop) {
            for (int i = start; i <= stop; i++) {
                System.out.print(i + " ");
            }
        }else {
            for(int i = start; i>=stop; i--){
                System.out.print(i + " ");
            }
        }
    }
    static void salut(){
        System.out.println("Salutare!");
    }

    static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}