class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int subract(int a,int b){
        return a-b;
    }
    int multiply(int a,int b){
        return a*b;
    }
    int division(int a,int b){
        return a/b;
    }
}
public class Main {
  public static void main(String[] args){
      Calculator calc=new Calculator();
      System.out.println("Add: "+calc.add(10,20));
      System.out.println("Subract: "+calc.subract(20,10));
      System.out.println("Multiplication: "+calc.multiply(10,20));
      System.out.println("Division: "+calc.division(10,20));
  }
}
