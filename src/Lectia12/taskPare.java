package Lectia12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class taskPare {
    static void main(String[] args ){
        try{
            Scanner file = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\Lectia1\\src\\Lectia12\\date.txt"));
            FileWriter Fout = new FileWriter("C:\\Users\\user\\IdeaProjects\\Lectia1\\src\\Lectia12\\pare.txt");
            int n = 5;
           int x;


           for(int i = 0; i<n; i++){
               x = file.nextInt();
               if(x % 2 == 0){
                   fout.write(x + " ");
               }
           }
            file.close();
            fout.colse();


        }catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }catch (IOException e) {
            System.out.println("");
        }
    }
}
