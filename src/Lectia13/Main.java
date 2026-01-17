package Lectia13;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Car car1 = new Car();//Crearea obiectului car1 pe baza clasei Car
        car1.brand = "Mercedes";
        car1.model = "G-class";
        car1.an = 2025;
        car1.culoare = "Black";
        car1.tipCombustibil = "Benzina";
        car1.pretPerZi = 100;

        car1.showCarInfo();
        car1.rent();

        Car car2 = new Car();


    }
}
