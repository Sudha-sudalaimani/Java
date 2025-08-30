import java.util.*;
public class ReverseBuilder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        StringBuilder result=new StringBuilder();
        result.append(input);
        result.reverse();
        
        System.out.println("ReversedString:"+result.toString());
    }
}

//Another Method

import java.util.*;
public class ReverseBuilder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        StringBuilder result=new StringBuilder(input);
        
        result.reverse();
        
        System.out.println("ReversedString:"+result.toString());
    }
}
