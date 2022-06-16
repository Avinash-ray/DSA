// 1. You are given a number n.
// 2. You've to create a pattern as shown in output format.

// Constraints
// 1 <= n <= 5

// Sample Input
// 5

// Sample Output
// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int a= 0;
        int b= 1;

        for(int row= 1; row<= n; row++){
            int nst= row;
            for(int i= 1; i<= nst; i++){

                int sum= a+b;
                System.out.print(a+"\t");

                a= b;
                b= sum;
            }
            System.out.println();
        }

    }
}