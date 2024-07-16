import java.util.Scanner;

public class profitorloss {
  public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.print("enter selling price");
int  sp= sc.nextInt();
System.out.print("enter cost price");
int cp = sc.nextInt();
if(sp>cp){
  System.out.println("profit is"+ (sp-cp));
}
else if(cp>sp){
  System.out.println("loss is ::" + Math.abs(sp-cp));
}
else{
  System.out.println("no loss no profit");
}
sc.close();

  }
}
