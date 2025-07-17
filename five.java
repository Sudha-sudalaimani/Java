import java.util.Scanner;
public class five {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        //Swapping a variable without using 3rd variable
        System.out.println("Enter A:");
        int a=scan.nextInt();
        System.out.println("Enter B:");
        int b=scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:");
        System.out.println("A:"+a);
        System.out.println("B:"+b);
    }
}
