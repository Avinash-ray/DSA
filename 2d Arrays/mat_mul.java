// 1. You are given a number n1, representing the number of rows of 1st matrix.
// 2. You are given a number m1, representing the number of columns of 1st matrix.
// 3. You are given n1*m1 numbers, representing elements of 2d array a1.
// 4. You are given a number n2, representing the number of rows of 2nd matrix.
// 5. You are given a number m2, representing the number of columns of 2nd matrix.
// 6. You are given n2*m2 numbers, representing elements of 2d array a2.
// 7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of product array as specified in output format.
// 8. If the two arrays can't be multiplied, print "Invalid input".

// Constraints
// 1 <= n1 <= 10^2
// 1 <= m1 <= 10^2
// -10^9 <= e11, e12, .. n1 * m1 elements <= 10^9
// 1 <= n2 <= 10^2
// 1 <= m2 <= 10^2
// -10^9 <= e11', e12', .. n2 * m2 elements <= 10^9

// Format
// Input

// A number n1
// A number m1
// e11 e12.. e21 e22.. .. n1 * m1 number of elements of array a1
// A number n2
// A number m2
// e11' e12'.. e21' e22'.. .. n2 * m2 number of elements of array a2

// Output
// e11'' e12'' e13'' .. e21'' e22'' e23'' .. .. elements of prd array

// Example
// Sample Input

// 2
// 3
// 10
// 0
// 0
// 0
// 20
// 0
// 3
// 4
// 1
// 0
// 1
// 0
// 0
// 1
// 1
// 2
// 1
// 1
// 0
// 0

// Sample Output
// 10 0 10 0
// 0 20 20 40

// code:::

import java.util.Scanner;

public class Main{
    public static void input(int mat[][], Scanner scn){
        for(int r=0; r< mat.length; r++){
            for(int c=0; c< mat[0].length; c++){
                mat[r][c]= scn.nextInt();
            }
        }
    }

    public static void display(int res[][]){
        for(int r=0; r< res.length; r++){
            for(int c=0; c< res[0].length; c++){
                System.out.print(res[r][c]+" ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixmultiplication(int mat1[][], int mat2[][]){
        int nr1= mat1.length, nc1= mat1[0].length;
        int nr2= mat2.length, nc2= mat2[0].length;
        int res[][]= null;

        if(nc1 == nr2){
            res= new int[nr1][nc2];

            for(int r=0; r< res.length; r++){
               for(int c=0; c< res[0].length; c++){

                    for(int k=0; k< nc1; k++){
                        res[r][c]= res[r][c]+ (mat1[r][k] * mat2[k][c]);
                    }
                }
            }

        }
        else{
            System.out.println("Invalid input");
        }

        return res;
        

    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int nr1= scn.nextInt();
    int nc1= scn.nextInt();
    int mat1[][]= new int[nr1][nc1];
    input(mat1,scn);

    int nr2= scn.nextInt();
    int nc2= scn.nextInt();
    int mat2[][]= new int[nr2][nc2];
    input(mat2,scn);

    int res[][]= matrixmultiplication(mat1,mat2);

    if(res != null){
    display(res);
    }
 }

}