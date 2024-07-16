import java.util.Scanner;

public class ElseIf{
  public static void main(String[] args) {
    

    //else-if came into role when u have lot condition to check

    //note:: using multiple single if statement cause error because each if staatement checked line by line

    //but using if-elseif-else cause execution of only one based on inner condition


//take input three number and print the least of them
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int a = sc.nextInt();
System.out.println("enter the number");
int b = sc.nextInt();
System.out.println("enter the number");
int c = sc.nextInt();
System.out.println("enter the quadrant x");
int x = sc.nextInt();
System.out.println("enter the quadrant y");
int y = sc.nextInt();


//without using else-if
// if(a>=b && a>=c)System.out.println("a is largest");
// if(b>=a && b>=c)System.out.println("b is largest");
// if(c>=a && c>=b)System.out.println("c is largest");

//problem with this code it can give result but print two more result so that is abiguity

//that came is else-if

//any-one of them will execute

if(a>=b && a>=c){
  System.out.println("a is largest"+a);
}
else if(b>=a && b>=c){
  System.out.println("b is largest"+b);
}else{
  System.out.println("c is largest"+c);
}

//Note:: if-elseif-else ek chain ki tarah hote hai jab unme se koi ek true ho jaye toh koi aur nhii chalega...

//question

if(x>0 && y>0){
  System.out.println("1 quadrant");
}
else if(x>0 && y<0){
  System.out.println("2 quadrant");
}
else if(x<0 && y<0){
  System.out.println("3 quadrant");
}
else if(x<0 && y>0){
  System.out.println("4 quadrant");
}
else if(x==0 && y!=0){
  System.out.print("Y-axis");
}
else if(x!=0 && y==0){
  System.out.print("X-axis");
}
else{
  System.out.println("origin ");
}


sc.close();
  }
}
