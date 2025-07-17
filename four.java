import java.util.Scanner;
public class four {
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter A:");
    int a=scan.nextInt();
    System.out.println("Enter B:");
    int b=scan.nextInt();
    int temp=a;
     a=b;
    b=temp;
    System.out.println("A:"+a);
    System.out.println("B:"+b);
    }
}
