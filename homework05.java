package HomeWork02;
import java.util.Scanner;
public class homework05 {
  public static void main (String args []) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Please enter the number");
    int num = reader.nextInt();
    if (num % 2 == 0 ) {
      System.out.println("The number is even");
    } else{
      System.out.println("The number is odd");
    }
  }  
}
