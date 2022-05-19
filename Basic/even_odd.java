import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    
  Scanner scn= new Scanner(System.in);
  int num= scn.nextInt();

  int rem= num%2;
  if(rem == 1){
    System.out.println("odd");
  }
  else{
    System.out.println("even");
  }
    
  }
}