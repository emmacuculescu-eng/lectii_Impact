package lectia2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Num1 = ");
//        int num1 = input.nextInt();
//
//        System.out.print("Num2 = ");
//        int num2 = input.nextInt();
//
//
//        System.out.println("Suma: " + (num1 + num2));
//        System.out.println("Diferenta: " + (num1 - num2));
//        System.out.println("Produsul: " + (num1 * num2));
//        System.out.println("Catul: " + (num1 / num2));
//
//        System.out.println("Pimul mai mare ca al doilea ? ("+ (num1>num2)+ ")" );
//
//        System.out.println("Num1 par? "+ (num1%2==0));


//        System.out.println("Varsta: ");
//        int varsta  = input.nextInt();
//
//        if (varsta >= 18) {
//            System.out.println("Persoana a indeplinit majoratul!");
//        }
//        else{
//            System.out.println("Persoana este minora");
//        }
//
//        if (varsta%2==0){
//            System.out.println("Varsta este para");
//        }
//        else{
//            System.out.println("Varsta este impara");
//        }
//
//        boolean elev = true;
//
//        if(varsta>=7){
//            System.out.println("Persoana este mai mare de 7 ani!");
//            if (elev){
//                System.out.println("Persoana studiaza la scoala");
//            }
//            else{
//                System.out.println("Persoana a finisat scoala");
//            }
//        }
//        else{
//            System.out.println("Probabil persoana este inca la gradininta");
//        }

        System.out.println("a =");

        int a = input.nextInt();


        System.out.println("b =");

        int b = input.nextInt();

        System.out.println("c =");

        int c = input.nextInt();

        if((a > b) && (a > c)){
            System.out.println("a este cel mai mare numar");
            System.out.println();

        }
        else if(b>a && b>c){
            System.out.println("b este cel mai mare numar");
        }
        else if(c>a && c>b){
            System.out.println("c este cel mai mare numar");
        }else{
            System.out.println("Numerele sunt egale (cel putin 2) ");
        }


        System.out.println("Inroduceti un numar de la 1 la 7 ");
        int ziuaSaptamanii = input.nextInt();

        switch (ziuaSaptamanii){
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Nu este o zi a saptamanii");
                break;
        }

        System.out.println("x=");
        int x = input.nextInt();

        String rezultat  = (x%2==0) ? "Numar par" : "Numar impar";


        String rezultat2 = (x>0) ? "Numar pozitiv"
                : (x == 0) ? "Numarul este 0"
                : "Numarul este negative";


        String zi = (x==1) ? "Luni"
                :( x==2 ) ? "Marti"
                :( x==3 ) ? "Miercuri"
                :( x==4 ) ? "Joi"
                :( x==5 ) ? "Vineri"
                :( x==6 ) ? "Sambata"
                :( x==7 ) ? "Duminica"
                : "Nu este zi a saptamanii";

        System.out.println(rezultat);
        System.out.println(rezultat2);


        int a1 = 100;
        int age = a1;

    }

}
