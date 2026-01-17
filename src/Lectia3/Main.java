package Lectia3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Age =");
        int age = input.nextInt();

        switch (age){
            case 7:
                System.out.println("1st grade");
                break;
            case 8:
                System.out.println("2nd grade");
                break;
            case 9 :
                System.out.println("3rd grade");
                break;
            case 10:
                System.out.println("4th grade");
                break;
            default:
                System.out.println("Not in primary school!");
        }






        if(age >= 18){

            if(age%2 == 0){
                System.out.println("age is Odd");
            }else{
                System.out.println("age is even");
            }

            System.out.println("Major");
        }
        else{
            age += 4;
            System.out.println("Minor" + age );
        }

//        System.out.print("Name =");
//        String name = input.next();

//        if (name.equals("Gheorghe")){
//            System.out.println("о это же я ");
//        }
//        else if( name == "Vasilii"){
//            System.out.println("Vasilii это не я");
//        }else {
//            System.out.println("это все ровно не я");
//        }


    }
}