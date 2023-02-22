/*Write a program that takes a letter grade as input (A, B, C, D, or F) and prints
whether the grade is passing or failing. A grade of A, B, or C is considered
passing, and a grade of D or F is considered failing. */

package HomeWork02;
import java.util.Scanner;

public class homework04 {
  char A;
  char B;
  char C;
  char D;
  char F;
  Scanner reader = new Scanner(System.in);


  public homework04(char A, char B, char C, char D, char F) {
    this.A = A;
    this.B = B;
    this.C = C;
    this.D = D;
    this.F = F;
  }
  public void getGrade() {
    System.out.println("Enter your grade letter");
    char grade = reader.next().charAt(0);

    if (grade == A || grade == B || grade == C) {
      System.out.println("You are passing");
    } else if (grade == D || grade == F) {
      System.out.println("You are failing");
    } else{
      System.out.println("Invalid input");
    }
  }
  public static void main (String args []) {
    homework04 getDisplay = new homework04('A', 'B', 'C', 'D', 'F');
    getDisplay.getGrade();
  }
}