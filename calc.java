import java.util.Scanner;
public class calc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        System.out.println("Enter Operator(+,-,*,/): ");
        String operator=sc.next();

        switch(operator){
            case "+":
                System.out.println("Sum: "+(num1+num2));
                break;
            case "-":
                System.out.println("Subraction: "+num1+num2);
                break;
            case "*":
                System.out.print("Multiplication: "+num1*num2);
                break;
            case "/":
                System.out.println("Division:"+num1/num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
