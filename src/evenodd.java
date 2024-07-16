import java.util.Scanner;

public class evenodd {
  public static void main(String[] args) {
    //take any integer input and tell even or odd

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
//     if(t%2==0){
// System.out.println("even no");
//     }
//     else{
//       System.out.println("odd");
//     }


    //this code can be more impact

    //in this case only one statement executed which satisfy the condition

    if(t%2==0) System.out.println("even");
else System.out.println("oddd");

// in this case each word statement got checked


if(t%2==0) System.out.println("even");
if(t%2!=0)System.out.println("odd");

    sc.close();
  }
}
