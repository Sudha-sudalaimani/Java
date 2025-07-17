import java.util.Scanner;
public class six {
    public static void main(String[]args){
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter A:");
      int a=scan.nextInt();
      System.out.println("Enter B:");
      int b=scan.nextInt();
      System.out.println("Enter C:");
      int c=scan.nextInt();
      if(a>b&&a>c){
        System.out.println("A is greater");
      }else if(b>a&&b>c){
        System.out.println("B is greater");
      }else{
        System.out.println("C is greater");
      }
    }
}
