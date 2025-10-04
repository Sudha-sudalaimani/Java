import java.util.*;
public class table {
    Scanner sc=new Scanner(System.in);

    void printtable(){
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i=i+1){
            System.out.println(i+" X "+num+" = "+num*i);
            }

    }
public static void main(String[] args){
   table t1=new table();
   t1.printtable();
}
}
