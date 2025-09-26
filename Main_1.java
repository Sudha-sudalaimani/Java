//inheritence concept
class Vehicle{
    String brand;
    void start(){
        System.out.println("Vehicle Started");
    }
}
class car1 extends Vehicle{
    String model;
    void displaycar(){
        System.out.println("Brand: "+brand +" Model: "+model);
    }
}
public class Main_1 {
    public static void main(String[] args){
       car1 c=new car1();
       c.brand="audi";
       c.model="2021 model";

       c.start();
        c.displaycar();
    }
}
