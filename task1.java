package HomeWork02;
public class task1 {
 public static void main(String args []) {
  double n1 = -1.0;
  double n2 = 4.5;
  double n3 = -5.3;
  double maxValue = 0;
  if (n1 > n2 && n1 >n3){
      maxValue = n1;
  }else if (n2 > n1 && n2 > n3){
      maxValue = n2;
  }else if (n3 > n2 && n3 > n1 ){
      maxValue = n3;
  }else{
    System.out.println("Invalid numbers entered");
  }
  System.out.println(maxValue);
 }

}
