public class Employee {
    int id;
    String name;
    int salary;
    Employee (int i,String n,int s){
        this.id=i;
        this.name=n;
        this.salary=s;
    }
    void displayDetails(){
        System.out.println("ID: "+id+", Name: "+name+", Salary: "+salary);
    }

    public static void main(String[] args){
        Employee e1=new Employee(101,"Arjun",50000);
        e1.displayDetails();
        Employee e2=new Employee(102,"Priya",60000);
        e2.displayDetails();
    }
}
