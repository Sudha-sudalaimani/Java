public class student_1 {
    void displayDetails(String n,int a,int m){
        System.out.println("Name : "+n+", Age: "+a+", Marks : "+m);
    }
    public static void main(String[] args){
        student_1 obj=new student_1();
        obj.displayDetails("Sam",19,98);
    }
}
