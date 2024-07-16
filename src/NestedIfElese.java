import java.util.Scanner;

public class NestedIfElese {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int a = sc.nextInt();
System.out.println("enter the number");
int b = sc.nextInt();
System.out.println("enter the number");
int c = sc.nextInt();

// a case came where we have to check a condithin from condition

//that case is completed by nesting the if else cases 

//nesting means inside a if a one or more if-else present

//for e.g print the smallest of three no. without using the And operator

if(a<b){
    if(a<c){
        System.out.println(a+"smalles");
    }  else{
      System.out.println(c+"smalles");
     }
}
else{
  if(b<c){
    System.out.println(b+"smallest");
  }
  else{
    System.out.println(c+"smalllest");
  }
}

//note:: else contain >= or <= if ur if contain > or <



sc.close();

  }
}
