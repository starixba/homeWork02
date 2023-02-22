package HomeWork02;
import java.util.Scanner;
public class homework11 {
  public static void main(String args []) {
    double sec, minute;
    char select;

    Scanner reader = new Scanner(System.in);
    System.out.println("Please select one of the following \n 1.) convert second to hour \n 2.) convert second to minute  \n 3.) convert second to second ");
    select = reader.next().charAt(0);
  
    switch (select) {
      case('1'):
      System.out.println("Enter how many second you want to convert to hour");
      sec = reader.nextDouble();
      System.out.println(sec / 3600  + " hour(s)");
      break;
      case('2'):
      System.out.println("Enter how many second you want to convert to minute");
      minute = reader.nextDouble();
      System.out.println(minute / 60 + " min(s)");
      break;
      case('3'):
      System.out.println("Enter how many second you want to convert to second");
      sec = reader.nextDouble();
      System.out.println(sec);
      System.out.println(sec + " second(s)");
      break;
      default:
      System.out.println("Invalid number");
    }
  }
}
