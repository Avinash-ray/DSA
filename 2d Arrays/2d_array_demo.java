1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to display the contents of 2d array as suggested by output format below.

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Example
Sample Input
2
4
11
12
13
14
21
22
23
24

Sample Output
11 12 13 14
21 22 23 24

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn= new Scanner(System.in);
    int nr= scn.nextInt();
    int nc= scn.nextInt();
    int mat[][]= new int[nr][nc];
    for(int r=0; r < mat.length; r++){
      for(int c=0; c< mat[0].length; c++){
        mat[r][c]= scn.nextInt();
      }
    }

    for(int r=0; r < mat.length; r++){
      for(int c=0; c< mat[0].length; c++){
        System.out.print(mat[r][c]+" ");
      }
      System.out.println();
    }
}
}