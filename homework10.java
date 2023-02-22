package HomeWork02;
import java.util.Scanner;
public class homework10 {
  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Please enter the integer");
    int digits = reader.nextInt();
    System.out.print("The sum is " + sumDigits(digits));
  }

  public static int sumDigits(long n) {
    int result = 0;
      while (n > 0){
        result += n % 10;
        n/=10;
      }
      return result;
  }
}
