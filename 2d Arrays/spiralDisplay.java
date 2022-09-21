// Spiral Display
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// -10^9 <= e1, e2, .. n * m elements <= 10^9

// Format
// Input
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output
// e11
// e21
// ..
// en1
// en2
// en3
// ..
// enm
// e(n-1)m
// ..
// e1m
// e1(m-1)
// ..
// e12
// e22
// e32
// ..

// Example
// Sample Input

// 3
// 5
// 11
// 12
// 13
// 14
// 15
// 21
// 22
// 23
// 24
// 25
// 31
// 32
// 33
// 34
// 35

// Sample Output
// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24

// code:::

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int nr= scn.nextInt();
        int nc= scn.nextInt();
        int mat[][]= new int[nr][nc];

        for(int r=0; r< nr; r++){
            for(int c=0; c< nc; c++){
                mat[r][c]= scn.nextInt();
            }
        }

        int rmin= 0, rmax= nr-1, cmin= 0, cmax= nc-1, count= 0;
        while(count< nr*nc){
            // left wall
            for(int r= rmin; r<= rmax && count< nr*nc; r++){
                System.out.println(mat[r][cmin]);
                count++;
            }
            // bottom wall
            for(int c= cmin+1; c<= cmax && count< nr*nc ; c++){
                System.out.println(mat[rmax][c]);
                count++;
            }
            // right wall
            for(int r= rmax-1; r>= rmin && count< nr*nc; r--){
                System.out.println(mat[r][cmax]);
                count++;
            }
            // top wall
            for(int c= cmax-1; c>= cmin+1 && count< nr*nc; c--){
                System.out.println(mat[rmin][c]);
                count++;
            }

            rmin++;
            rmax--;
            cmin++;
            cmax--;
        }


    }

}
