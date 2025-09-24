public class Student {
    String Name;
    int age;
    int marks;

    void displayDetails(){
        System.out.println("Name: "+Name+" Age: "+age +" Marks: "+marks);
    }
    public static void main(String[] args){
        Student ram=new Student();
        ram.Name="Ram";
        ram.age=19;
        ram.marks=90;
        ram.displayDetails();
        // Second object
        Student sam=new Student();
        sam.Name="Sam";
        sam.age=19;
        sam.marks=98;
        sam.displayDetails();
    }
}
