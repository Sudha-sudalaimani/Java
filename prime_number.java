public class prime_number {
    void display(){
        for(int i=2;i<=50;i=i+1){
            boolean is_prime=true;
            for(int num=2;num<i;num=num+1){
                if(i%num==0){
                    is_prime=false;
                    break;
                }
            }

            if(is_prime){
                System.out.println(i+ " ");

            }
        }
    }
public static void main(String[] args){
        prime_number p1=new prime_number();
        p1.display();
}
}
