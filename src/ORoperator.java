import java.util.Scanner;

public class ORoperator {
  public static void main(String[] args) {
    // || opertor return true if unme se koi ek true ho jaaye...
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%3==0 || n%5==0)System.out.println("yess");
    else System.out.println("no");

sc.close();

  }
}
