import java.util.Scanner;

public class Assignment {
  public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
// int y = sc.nextInt();
// if(y%4==0){
//   System.out.println("it is a leapyear");
// }
// else{
//   System.out.println("not a leap year");
// }

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
// if(a>b){
//   if(a>c){
// System.out.println(a+"is larger");
//   }else{
// System.out.println(c+"is larger");
//   }
// }
// else{
//   if(b>c){
//     System.out.println(b+"larger");
//   }
//   else{
//     System.out.println(c+"larger");
//   }
// }

// if(a+b>c && b+c>a && c+a>b){
// if(a==b && b == c && c==a){
//   System.out.println("equilateral one");
// }
// else if(a==b || b==c || c==a){
//   System.out.println("it is a isosceles triangle");
// }
// else{
//   System.out.println("it is scalene");
// }
// }


//using nested if-else print the print the smallest one
if(a<b){
  if(a<c){
    System.out.println(a + " smallest");
  }
  else{
    System.out.println(c + "smallest");
  }
}else{
  if(b<c){
    System.out.println(b+"smallest");
  }
  else{
    System.out.println(c+"smallest");
  }
}



sc.close();
  }
  
}
