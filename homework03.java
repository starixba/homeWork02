/*Write a program that takes two integers as input and prints "The numbers are
equal" if they are equal, "The first number is greater" if the first number is
greater, and "The second number is greater" if the second number is greater. */
package HomeWork02;

import java.util.Scanner;

public class homework03 {
  int firstNum;
  int secondNum;
  Scanner reader = new Scanner(System.in);

  public homework03(int firstNum, int secondNum) {
    this.firstNum = firstNum;
    this.secondNum = secondNum;
  }

  public void getIntegers() {
    System.out.println("Enter your first number");
    int x = reader.nextInt();
    System.out.println("Enter your second number");
    int y = reader.nextInt();

    if (x > y) {
      System.out.println("The first number is greater");
    } else if (x < y) {
      System.out.println("This second number is greater greater");
    } else if (x == y) {
      System.out.println("The number are equal");
    } else {
      System.out.println("invalid number");
    }

  }

  public static void main(String args[]) {
    homework03 getDisplay = new homework03(0, 0);
    getDisplay.getIntegers();
  }
}
