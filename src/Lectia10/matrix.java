package Lectia10;

public class matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("The element on the position arr [0][2] :" + arr[0][2]);
        System.out.println("The element on the position arr [1][0] :" + arr[1][0]);

        System.out.println("-------The matrix elements arr are-------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }


        int[][] synth = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += synth[i][i];
        }
        System.out.println("_______The answer of the synth is :" + sum);

        int[][] a = {
                {5, 8, 4},
                {3, 6, 2},
                {1, 7, 9}
        };

        int sum1 = 0;
        int n = 3;
        for (int i = 0; i < n; i++) {
            sum1 += a[1][n - 1 - i];
        }
        System.out.println("_______The answer of a is :" + sum1);

        int[][] b = {
                {5, 8, 4},
                {3, 6, 2},
                {1, 7, 9}
        };

        int c=3;
        int p=1;
        for(int i=0; i<n;i++){
            p+= b[i][c-1-i];
        }
        System.out.println("The product of b is :" + p) ;

        boolean synt = true;

        for(int i= 0; i<c ;i++){

            synt= false;
            break;





        }



    }


}
