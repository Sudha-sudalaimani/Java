public class evenorodd {
    void display(){
        for(int i=1;i<=20;i=i+1){
            if(i%2==0){
                System.out.println(i+" is Even");
            }
            else{
                System.out.println(i+" is Odd");
            }
        }
    }
public static void main(String[] args){
    evenorodd d2=new evenorodd();
    d2.display();
}
}

