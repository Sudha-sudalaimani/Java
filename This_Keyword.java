public class This_Keyword {
    String name;
    int age;
    int marks;
    void set_Details(String n,int a,int m){
        this.name=n;
        this.age=a;
        this.marks=m;
    }
    void displayDetails(){
        System.out.println("Name: "+name+", Age: "+age+", Marks: "+marks);
    }
    public static void main(String[] args){
        This_Keyword t1=new This_Keyword();
        t1.set_Details("Sam",19,100);
        t1.displayDetails();
    }
}
