package HomeWork02;

import java.util.Scanner;

public class homework01 {
  String adult;
  String minor;
  Scanner reader = new Scanner(System.in);

  public homework01(String adult, String minor) {
    this.adult = adult;
    this.minor = minor;
  }

  public void getAge() {
    System.out.println("Enter your age");
    int age = reader.nextInt();

    if (age >= 0 && age <= 17) {
      System.out.println("You are " + this.minor);
    } else if (age >= 18) {
      System.out.println("You are " + this.adult);
    } else {
      System.out.println("Invalid number");
    }
  }

  public static void main(String args[]) {
    homework01 getDisplay = new homework01("Adult", "Minor");
    getDisplay.getAge();
  }
}
