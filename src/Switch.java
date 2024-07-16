import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    
//why it is necessary 
//not much just replacement of if-else case
//yahan switch ek value rakhta aur wo value comare hoti , aur jidhar true hua wahi execute hona start ho jayega 
//lekin ek problem hai agar koi match kiya toh saare run kar jaayege
//isiliye break keyword use kiya jata hai..


    Scanner sc = new Scanner(System.in);
    System.out.println("enter the values");
    int a = sc.nextInt();
    int b = sc.nextInt();
    char ch = sc.next().charAt(0);
    switch (ch) {
      case '+':
      System.out.println(a+b);
        break;
        case '-':
        System.out.println(a-b);
          break;
          case '*':
          System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
              break;
      default:
      System.out.println("not a perfect value");
        break;
    }
    sc.close();
  }
}
