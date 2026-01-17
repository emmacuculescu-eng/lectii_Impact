package Lectia8;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] noteSemestriale = {8.33, 9, 10, 9.25, 8.75};
        String[] produse = {"Paine", "Lapte", "Apa", "Calacaval"};
        String[] elevi = {
                "Emma",
                "Eugen",
                "Darius",
                "Bruno",
                "Gheorghe",
                "Valentin",
                "Anastasia",
                "Andei",
                "Stefan"
        };

        System.out.println("Numarul de elevi " + elevi.length);
        System.out.println("Ultimul elev din lista este " + elevi[8]);
        System.out.println("Ultimul elev din lista este " + elevi[elevi.length - 1]);

        int[] noteExamen = new int[4];
        String[] subiecteExamen = new String[4];

        Scanner input = new Scanner(System.in);

        subiecteExamen[0] = "Limba romina";
        noteExamen[0] = 9;

        subiecteExamen[0] = "Mate";
        noteExamen[3] = 8;

        for (int index = 0; index < elevi.length; index++)
            System.out.println("Elevul " + (index + 1) + " este " + elevi[index]);


        for(int index = 0; index < noteExamen.length; index++){
            System.out.print("Introduceti " + (index+1) + " subiect de examen = ");
            subiecteExamen[index] = input.next();

            System.out.print("Introduceti nota pentru " + subiecteExamen[index] + " = ");
            noteExamen[index] = input.nextInt();
        }

        for(int index = 0; index < noteExamen.length; index++){
            System.out.println(subiecteExamen[index] + " nota = " + noteExamen[index]);
        }

    }
}