package HomeWork02;
import java.util.Scanner;
public class homework09 {
  public static void main(String args []) {
    
    double x, y, answer;
    char o;

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter your operator");
    o = reader.next().charAt(0);

    System.out.println("Please enter your first number");
    x = reader.nextInt();

    System.out.println("Please enter your second number");
    y = reader.nextInt();

    switch (o){
      case '+': answer = x + y;
      System.out.println(x + " + " + y + " = " + answer);
      break;
      case '-': answer = x - y;
      System.out.println(x + " - " + y + " = " + answer);
      break;
      case '*': answer = x * y;
      System.out.println(x + " * " + y + " = " + answer);
      break;
      case '/': answer = x / y;
      System.out.println(x + " / " + y + " = " + answer);
      break;
      default:
      System.out.println("Invalid operator!");
      break;
    }
  }
}
