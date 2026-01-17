package Lectia11;

public class HW {
    static void main() {
        int [][] a = new int[3][3];


        for(int i =0; i<a.length; i++){
            for(int y=0; y<a[i].length; y++){

                System.out.print("a[" + i + "][" + y +"]=");
            }
            System.out.println();
        }


        System.out.println();
        for(int[] rand : a){
            System.out.println();
        }
    }
}
