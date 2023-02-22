
/*Write a program that takes a user's score as input and prints out their letter
grade based on the following scale: A = 90-100 B = 80-89 C = 70-79 D = 60-69 F =
0-59 */
package HomeWork02;
import java.util.Scanner;

public class homework02 {
    char A;
    char B;
    char C;
    char D;
    char F;
    Scanner reader = new Scanner(System.in);
    public homework02(char A, char B, char C, char D, char F) {
      this.A = A;
      this.B = B;
      this.C = C;
      this.D = D;
      this.F = F;
    }
    public void getGrade() {
      System.out.println("Please enter your score");
      int grade = reader.nextInt();

      if (grade >=90 && grade == 100) {
        System.out.println("You have " + this.A + " grade");
      }  else if (grade >= 80 && grade <= 89) {
        System.out.println("You have " + this.B + " grade");
      }  else if (grade >= 70 && grade <= 79) {
        System.out.println("You have " + this.C + " grade");
      }  else if (grade >= 60 && grade <= 69) {
        System.out.println("You have " + this.D + " grade");
      }  else if (grade <= 59) {
        System.out.println("You have " + this.F + " grade");
      } else {
        System.out.println("Invalid number");
      }
    }
    public static void main(String args[]) {
      homework02 getDisplay = new homework02('A', 'B', 'C', 'D', 'F');
      getDisplay.getGrade();
    }
}
