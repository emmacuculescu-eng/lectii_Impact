package Lectia15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Vehicul v1 = new Car();
        Vehicul v2 = new Airplane();

        v1.FuelUp();
        v1.move();

        v2.move();

        Payment p1 = new CardPayment();
        Payment p2 = new CashPayment();

        p1.processPayment(50);
        p2.processPayment(99.9);

        List<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");

        System.out.println(cars);


        cars.removeFirst();

        System.out.println("Primul element " + cars.get(0));
        System.out.println("Primul element " + cars.getFirst());

        cars.add(2,"Mazda");


        System.out.println(cars);


        //Set
        Set<String> cities = new HashSet<>();

        cities.add("London");
        cities.add("Paris");
        cities.add("Roma");
        cities.add("Paris");
        cities.add("Paris");
        cities.add("Paris");

        System.out.println(cities);

        cities.remove("London");

        System.out.println(cities);

        //Map - Dictionar

        Map<String, String> students = new HashMap<>();

        students.put("name", "Andrei");
        students.put("surname", "Creanga");
        students.put("media", "9,7");


        System.out.println(students);

        System.out.println("Media studentului = " + students.get("media"));


        int varsta;

        Scanner input = new Scanner(System.in);
        boolean correct = false;
        while (correct) {
            try  {
                System.out.print("Introduceti varsta: ");
                varsta = input.next.Int();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Must be entered an int value");
                input.next();
            } catch (Exception e) {
                System.out.println("Unknown ");
            }

        }
    }
}
