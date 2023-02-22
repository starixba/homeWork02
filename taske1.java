package HomeWork02;
import java.util.Scanner;
public class taske1 {
  int[] myStylishness;
  int[] dateStylishness;

  public taske1(int[] myStylishness, int[] dateStylishness){
  this.myStylishness = myStylishness;
  this.dateStylishness = dateStylishness;
}
  public void getRange() {
    Scanner reader = new Scanner(System.in);
        
    System.out.println("Please enter score (1 - 10) the stylishness of your clothes");
    int[] myStylishness = new int[3];
  }
  public static void main(String[] args) {
    taske1 peak = new taske1(null, null);
    peak.getRange();
  }
}

