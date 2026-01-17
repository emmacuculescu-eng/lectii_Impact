package Lectia12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Cautare{
    static void main(String[] args) {

        String cautare = "C:\\Users\\Yamato\\IdeaProjects\\Projects\\src\\Online1\\lectia12\\Cautare10\\cautare.txt";
        String rezultat = "C:\\Users\\Yamato\\IdeaProjects\\Projects\\src\\Online1\\lectia12\\Cautare10\\rezultat.txt";

        Scanner input = new Scanner(System.in);

        System.out.print("Ce numar cautati in fisier: ");
        int numar = input.nextInt();


        cautareNumar(cautare, rezultat, numar);
    }

    public static void cautareNumar(String caleaFisierIntrare, String caleaFisierRezultat, int numar) {

        try {
            Scanner fin = new Scanner(new File(caleaFisierIntrare));
            FileWriter fout = new FileWriter(caleaFisierRezultat);

            int x;
            while (fin.hasNext()) {
                if (fin.hasNextInt()) {
                    x = fin.nextInt();
                    if (x == numar) {
                        fout.write("Numarul " + numar + " a fost gasit");
                        break;
                    }
                } else {
                    fin.next();
                }
            }
            fin.close();
            fout.close();

        } catch (IOException e) {
            System.out.println("A aparut o eroare la scriere/citire.");
        }


    }
}