// 1. You are given a number n. 
// 2. You've to create a pattern of * and separated by tab as shown in output format.


// Constraints
// 1 <= n <= 100

// Sample Input
// 5

// Sample Output
// *	*	*	*	*	
// 	*	*	*	*	
// 		*	*	*	
// 			*	*	
// 				*

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        for(int row=1; row<= n; row++){
        int nst= n+1-row;
        int nsp= n-nst;

        for(int i=1; i<= nsp; i++){
            System.out.print(" \t");
        }            
        for(int i=1; i<= nst; i++){
            System.out.print("*\t");
        }
        System.out.println();
        }

    }
}

