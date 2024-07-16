import java.util.Scanner;

public class abs {
  public static void main(String[] args) {
    
//any number whetehr it is +ve or -ve it give +ve value

Scanner sc = new Scanner(System.in);
System.out.println("enter the number0");
int n = sc.nextInt();
if(n>0)System.out.println(n);
else System.out.println(-1*n);
sc.close();

  }
}
