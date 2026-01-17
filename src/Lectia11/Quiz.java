package Lectia11;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score =0;
        char answer;

        System.out.println("===QUIZ GAME===");


        System.out.println("1)Care este capotala Frantei?");
        System.out.println("a)Londra b) Bucaresti c)Paris d)Madrid");
        answer = input.next().charAt(0);
        if(answer == 'c' || answer == 'C'){
            score++;
        }

        System.out.println("2)Radical din 100?");
        System.out.println("a)20 b) 10 c)5 d)15");
        answer = input.next().charAt(0);
        if(answer == 'b' || answer == 'B'){
            score++;
        }

        System.out.println(")Ce companie a creat Java");
        System.out.println("a)Microsoft b) Oracle c)Google d)Sun Microsystem");
        answer = input.next().charAt(0);
        if(answer == 'd' || answer == 'D'){
            score++;
        }


        System.out.println("Ati obtinut " + score + "/3 raspunsuri correcte!");

    }
}
