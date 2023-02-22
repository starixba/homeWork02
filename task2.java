package HomeWork02;
import java.util.Scanner;
public class task2 {
  String infancy;
  String todder;
  String earlySchoolAge;
  String middleSchoolAge;
  String earlyAdolescence;
  String laterAdolescence;
  String earlyAdulthood;
  String middleAdulthood;
  String LaterAdulthood;
  Scanner reader = new Scanner(System.in);
  public task2(String infancy, String todder, String earlySchoolAge, String middleSchoolAge, String earlyAdolescence, String laterAdolescence, String earlyAdulthood, String middleAdulthood, String LaterAdulthood){
    this.infancy = infancy;
    this.todder = todder;
    this.earlySchoolAge = earlySchoolAge;
    this.middleSchoolAge = middleSchoolAge;
    this.earlyAdolescence = earlyAdolescence;
    this.laterAdolescence = laterAdolescence;
    this.earlyAdulthood = earlyAdulthood;
    this.middleAdulthood = middleAdulthood;
    this.LaterAdulthood = LaterAdulthood;
  }
  public void getStages(){
    System.out.println("Enter your age");
    int age = reader.nextInt();
    if (age == 1 && age <=2){
      System.out.println("You are in " + this.infancy);
    } else if (age >=2 && age <= 4) {
      System.out.println("You are in " + this.todder);
  } else if (age >= 5 && age <= 7 ) {
    System.out.println("You are in " + this.earlySchoolAge);
  } else if (age >= 8 && age <= 12) {
    System.out.println("You are in " + this.middleSchoolAge);
  } else if (age >=13 && age <= 17) {
    System.out.println("You are in " + this.earlyAdolescence);
  } else if (age >= 18 && age <= 25 ) {
    System.out.println("You are in " + this.laterAdolescence);
  } else if (age >= 25  && age <= 30) {
    System.out.println("You are in " + this.earlyAdulthood);
  } else if (age >=30 && age <= 50) {
    System.out.println("You are in " + this.middleAdulthood);
  } else if (age >= 50) {
    System.out.println("You are in " + this.LaterAdulthood);
  } 
    else{
      System.out.println("Invalid number");
  }
}
    public static void main(String args[]) {
      task2 age = new task2("infancy", "todder", "early school age", "middle school age", "early Adolescence", "later Adolescence", "early adulthood", "Middle adulthood", "Later adulthood");
        age.getStages();
    }
  }
  


