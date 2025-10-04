public class sumofnums {
    int sum=0;
    void display(){
        for(int i=1;i<=50;i++){
            sum=sum+i;
        }
        System.out.println("Sum of 1 to 50 : "+sum);
    }
public static void main(String[] args){
         sumofnums d1=new sumofnums();
         d1.display();
}
}
