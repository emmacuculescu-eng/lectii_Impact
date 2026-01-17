package Lectia6;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();

        int result = SumaCifrelor(x);
        System.out.println("rezultatul este: " + result);


        System.out.print("x2 = ");
        int x2 = input.nextInt();

        int result2 = factorial(x2);
        System.out.println("rezultatul factorialului este: " + result2);


        System.out.println(sumaNumerelor(6));

    }
    public static int SumaCifrelor(int num){
        int suma = 0;
        while(num != 0){
            suma +=  num % 10; //suma = suma + num % 10
            num /= 10; // num = num /10;
        }
        return  suma;

    }

    public static int ProdusCifrelor(int num){
        int produs = 1;
        while(num != 0){
            produs *=  num % 10; //prod = produs * num % 10
            num /= 10; // num = num /10;
        }
        return  produs;
    }

    public static int factorial(int num){
        if(num == 0)
            return 0;
        if(num == 1)
            return 1;

        return num * factorial(num-1);


    }
    public static int sumaNumerelor(int num){

        if(num==1){
            return 1;
        }else{
            System.out.println(num);
            return num + sumaNumerelor(num - 1);
        }
    }
}
