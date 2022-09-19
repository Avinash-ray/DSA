// Exit Point Of A Matrix
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// e1, e2, .. n * m elements belongs to the set (0, 1)

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
// row
// col (of the point of exit)

// Example
// Sample Input

// 4
// 4
// 0
// 0
// 1
// 0
// 1
// 0
// 0
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// 1
// 0

// Sample Output
// 1
// 3

// code:::

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int nr= scn.nextInt();
        int nc= scn.nextInt();
        int mat[][]= new int[nr][nc];

        for(int r=0; r< nr; r++){
            for(int c=0; c< nc; c++){
                mat[r][c]= scn.nextInt();
            }
        }

        int dir=0;
        int r=0, c=0;
        while(r< nr && r>= 0 && c>= 0 && c< nc){
            dir= (dir + mat[r][c])%4;
            if(dir == 0){
                c+= 1;
            }
            else if(dir == 1){
                r+= 1;
            }
            else if(dir == 2){
                c-= 1;
            }
            else{
                r-= 1;
            }

        }

        if(dir == 0){
                c-= 1;
            }
            else if(dir == 1){
                r-= 1;
            }
            else if(dir == 2){
                c+= 1;
            }
            else{
                r+= 1;
    }
    System.out.println(r);
    System.out.println(c);

}}
