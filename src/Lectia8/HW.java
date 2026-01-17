package Lectia8;

import java.util.Random;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(1,51);

//        while(true){
//            System.out.print("Guess the number= ");
//            int guess = input.nextInt();
//
//            if(guess < secret){
//                System.out.println("Numarul este mai mare decat " + guess);
//            }
//            else if(guess > secret){
//                System.out.println("Numarul este mai mic decat " + guess);
//            }
//            else{
//                System.out.println("Ai ghicit numarul a fost " + secret);
//                break;
//            }
//        }


        System.out.print("Introduceti un cuvant = ");
        String nume = input.next();

        System.out.println("Lungimea cuvantului introdus este " + nume.length());
        for (int index = 0; index < nume.length(); index++){
            System.out.println("Caracterul pe adresa (indexul) " + index
                    + " este " + nume.charAt(index));
        }

        System.out.println("Introduceti primul sir = ");
        String sir1 = input.next();
        System.out.println("Introduceti al doilea sir = ");
        String sir2 = input.next();

        if(sir1.equals(sir2)){
            System.out.println("Sirurile sunt egale");
        }
        else if(sir1.equalsIgnoreCase(sir2)){
            System.out.println("Sirurile sunt egale, dar scrise diferit(Majuscule/minuscule)");
        }
        else{
            System.out.println("Sirurile sunt diferite");
        }


    }
}