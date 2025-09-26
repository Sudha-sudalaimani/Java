//Encapsulation concept
public class Bank {
    private int accno;
    private String accHolderName;
    private double balance;
    double money;

    public void setDetails(int accno, String accHolderName, double balance) {
        this.accno = accno;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public void GetDetails() {
        System.out.println("Account_No: " + accno + ", Account_Holder_Name: " + accHolderName + ", Balance: " + balance);
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount+"New Balance: "+balance);
    }

    public void withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("Withdraw: "+amount+" New Balance : "+balance);
        }
        else{
            System.out.println("Invalid Balance");
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setDetails(101, "Sam", 10000);
        b1.GetDetails();
        b1.deposit(2000);
        b1.withdraw(500);
        b1.GetDetails();
    }
}
