public class car{
    String brand;
    int  speed;

    void drive(){
        System.out.println(brand+" Driving speed at "+speed+"km/h");
    }
    public static void main(String args[]){
            car c1=new car();
            c1.brand="BMW";
            c1.speed=120;
            car c2=new car();
            c2.brand="Audi";
            c2.speed=100;

            //call method
            c1.drive();
            c2.drive();
    }
}
