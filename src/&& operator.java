import java.util.Scanner;

class Operator {
  //whenever u have to check two or more condition go for operators
  //&&=> true when both true
  //or=> true when one is true
  //both are logical operator!
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // if(n/10>=10 && n/100<10){
    //   System.out.println("yes it");
    // }
    // else{
    //   System.out.println("no");
    // }

    //simple one

    if(n>99 && n<1000){
      System.out.println("yes it");
    }
    else{
      System.out.println("no");
    }

sc.close();



  }
}
