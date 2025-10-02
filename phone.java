public class phone {
    static String chargertype="C-Type"; //class variable

    String brand;
    int price;

    phone(String b,int p){
        this.brand=b;   //instance variable
        this.price=p;
    }
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Chargertype: "+chargertype);
    }
    public static void main(String[] args){
        phone realme=new phone("Realme",15000);
        realme.display();

        phone google=new phone("Pixel",40000);
        google.display();
        
        phone samsung=new phone("Samsung",20000);
        samsung.display();
    }
}
