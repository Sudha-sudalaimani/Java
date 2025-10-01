//another way
import java.util.*;
public class Leapyear1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year=sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" Leap Year");
        }
        else{
            System.out.println(year+" Not a Leap Year");
        }
    }
}
