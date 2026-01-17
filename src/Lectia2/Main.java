package lectia2;

import java.util.Scanner;

public class Lectia2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);




        //tema pentru acasa
        String address = "-_0 Main \t street \n 123";
        int age = 100;
        char code = '^';

//        System.out.printf(address);

        int x = 50;
        int y = 100;




        double z = 50;
        double h = 100;


        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x / y);
        System.out.println(y / x);
        System.out.println();
        System.out.println(z + h);
        System.out.println(z - h);
        System.out.println(z * h);
        System.out.println(z/h);
        System.out.println(h/z);

        System.out.println(x/h);
        System.out.println(h+x);

        System.out.println(88%8);

        System.out.println(89%8);
        System.out.println(90%8);
        System.out.println(95%8);
        System.out.println(96%8);


        System.out.println(5%2);

        double num1 = 100;
        double num2 = 30;

        System.out.println( (num1+num2 > 60) || (num1>num2) );
        x = 20;
        y = 7;

    /*    System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));*/

        //Raspunsul nu este corect din cauza ca folosim variablie int
        /*   System.out.println("x / y = " + (x / y));*/
        System.out.println("x % y = " + (x % y));


        System.out.print("Introduce-ti varsta: ");

        //in - obiectul care permite citirea
        //nextInt - permite introducea numerelor intregi
        int Age = in.nextInt();

        System.out.println("Varsta este de " + Age);

        in.nextLine();
        System.out.println("Introdu Numele si Prenumele");
        String numeUtilizator = in.nextLine();
        System.out.println("Numele tau este:" + numeUtilizator);




        int a,b,c;
        System.out.println("Intoduce a: ");
        a = in.nextInt();
        System.out.println("Intoduce b: ");
        b = in.nextInt();
        System.out.println("Suma: "+ ( a + b ));


    }
}