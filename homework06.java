package HomeWork02;

import java.util.Scanner;

public class homework06 {
  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter positive or negative number");
    int num = reader.nextInt();

    if (num <= -1) {
      System.out.println("The number is negative");
    } else if (num >= 1) {
      System.out.println("The number is positive");
    } else if (num == 0) {
      System.out.println("The numer is zero");
    } else {
      System.out.println("Invalid number");
    }

  }
}