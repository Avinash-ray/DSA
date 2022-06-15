// 1. You are given a number n. 
// 2. You've to create a pattern as shown in output format.


// Constraints
// 1 <= n <= 44

// Example
// Sample Input
// 5

// Sample Output
// 1	
// 2	3	
// 4	5	6	
// 7	8	9	10	
// 11	12	13	14	15

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int count= 1;

        for(int row= 1; row<= n; row++){
            int nst= row;

            for(int i=1; i<=nst; i++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }

    }
}