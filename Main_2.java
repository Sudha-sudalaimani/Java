//inheritance concept
class Employee1{
    int id;
    String name;
    double salary;
    void displayDetails(){
        System.out.println("ID: "+id+" Name: "+name+" Salary: "+salary );
    }
}
class Manager extends Employee1{
    String department;
    void displayManagerdetails(){
        super.displayDetails(); //  reuse parent method
        System.out.println(" Department: "+department);
    }
}
public class Main_2 {
    public static void main(String[] args){
        Manager m1=new Manager();
        m1.id=101;
        m1.name="Sam";
        m1.salary=85000.00;
        m1.department="developer";

        //m1.displayDetails();
        m1.displayManagerdetails();
    }
}
