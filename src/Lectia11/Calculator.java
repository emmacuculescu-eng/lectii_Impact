package Lectia11;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        boolean menu = true;

        double a;
        double b;


        while(menu){
            System.out.println("\n_____Calculator____");
            System.out.println("1. Adunare.");
            System.out.println("2. Scadere.");
            System.out.println("3. Inmultire.");
            System.out.println("4. Impartire.");
            System.out.println("5. Restul Impartirii.");
            System.out.println("6. Ridicarea la putere.");
            System.out.println("7. Radical.");
            System.out.println("0. Iesire.");
            System.out.println("\tIntroduceti varianta dorita");
            int varianta = input.nextInt();
            if(varianta == 0){
                menu = false;//break;
            }
            switch (varianta){
                case 1:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    System.out.println(a + " + " + b + "=" + (a+b));

                    break;
                case 2:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    System.out.println(a + " - " + b + "=" + (a-b));

                    break;
                case  3:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    System.out.println(a + " * " + b + "=" + (a*b));

                    break;
                case 4:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    if(b!=0){
                        System.out.println(a + " / " + b + "=" + (a/b));
                    }
                    else{
                        System.out.println("b nu poate fi egal cu 0!");
                    }
                    break;
                case 5:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    System.out.println(a + " % " + b + "=" + (a%b));

                    break;
                case 6:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    System.out.print("b = ");
                    b = input.nextDouble();
                    System.out.println(a + "la puterea " + b + "=" + Math.pow(a,b));
                    break;
                case 7:
                    System.out.print("a = ");
                    a = input.nextDouble();
                    if(a>=0) {
                        System.out.println("Radical din " + a + " = " + Math.sqrt(a));
                    }
                    else{
                        System.out.println("a nu poate fi un numar negativ!");
                    }
                    break;
                default:
                    System.out.println("Aceasta varianta nu exista!");
                    break;
            }



        }
    }
}
