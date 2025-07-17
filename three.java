import java.util.Scanner;
public class three {
    public static void main(String[]args){
       Scanner scan=new Scanner(System.in);
       int check=scan.nextInt();
       if(check%2==0){
        System.out.println("Its even number");
       }else{
        System.out.println("Its Odd Number");
       }
    }
}
