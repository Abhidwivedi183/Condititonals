import java.util.Scanner;

public class triangleornot {
  public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println("enter sides");
int a = sc.nextInt();
int b = sc.nextInt();
int c  = sc.nextInt();

//Note:: the hierarchy of  +,-and very high than that >,<,>= why to keep this in mind we put the arithmatic statement in bracket


//it is always good practice
if((a+b)>c &&(b+c)>a && (c+a)>b){
  System.out.println("yess");
}
else{
  System.out.println("No");
}
sc.close();

  }
}
