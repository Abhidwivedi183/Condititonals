import java.util.Scanner;

public class Ternaryop {
  public static void main(String[] args) {
    //a Replacement of if-else condition
    //cool bnaane ka tareeka..

    // syntax
    //(condition) ? (on true) : ( on false)
    //e.g of even-odd
    //it return the values either true or false depend on condittion
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
System.out.println(  (n%2==0) ? "even" : " odd");

sc.close();

  }
}
