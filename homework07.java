package HomeWork02;

import java.util.Scanner;

public class homework07 {

  Scanner reader = new Scanner(System.in);
  int daySelection;
  String dayName;

  public homework07(int day, String dayName) {
    this.daySelection = daySelection;
    this.dayName = dayName;
  }

  public void getDayNumber() {
    System.out.println("Select number 1 - 7");
    int daySelection = reader.nextInt();
    if (daySelection == 1) {
      System.out.println("Monday");
    } else if (daySelection == 2) {
      System.out.println("Tuesday");

    } else if (daySelection == 3) {
      System.out.println("Wednesday");

    } else if (daySelection == 4) {
      System.out.println("Thursday");

    } else if (daySelection == 5) {

      System.out.println("Friday");

    } else if (daySelection == 6) {
      System.out.println("Saturday");

    } else if (daySelection == 7) {
      System.out.println("Sunday");

    } else {
      System.out.println("Invalid number!");

    }
  }

  public static void main(String args[]) {
    homework07 selection = new homework07(0, "day");
    selection.getDayNumber();
  }
}
