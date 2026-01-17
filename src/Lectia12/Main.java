package Lectia12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void mai(String[]args) {
    try{
        Scanner file = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\Lectia1\\src\\Lectia12\\a.txt"));
        FileWriter fout = new FileWriter("C:\\Users\\user\\IdeaProjects\\Lectia1\\src\\Lectia12\\output.txt");
        int n, x, sum =0;

        n = file.nextInt();
        for(int i = 0; i<n; i++){
            x = file.nextInt();
            sum +=x;
        }
        System.out.println("Suma elementelor din fisier = " + sum);

        file.close();
        fout.write("Suma elementelor din fisier a.txt = " + sum);
        fout.write("Media numerelor din a.txt " + (float) sum/n);

        fout.close();

    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    } catch (IOException e) {
        System.out.println("Eroare la scrierea datelor in fisier");
    }


    }
}
