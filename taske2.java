package HomeWork02;
import java.util.Random;
import java.util.Scanner;
public class taske2 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to a guessing game");
    int secretNumber = random.nextInt(9999);
    for(int i = 1; i < 3; i++){
      System.out.println("Please put 4 digits number");
    }
  }
}
