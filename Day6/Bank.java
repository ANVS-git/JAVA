public class Bank {

    private String AccountHolder; 
    private int AccountNumber; 
    private double balance;


    public Bank(String AccountHolder, int AccountNumber,double balance){
        this.AccountHolder=AccountHolder; 
        this.AccountNumber=AccountNumber; 
        this.balance=balance;  
    }

    public void Deposit(double amount){
            balance=balance+amount; 
            System.out.println("Amount deposited successfully.");
            System.out.println("Balance: "+balance);
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Amount not sufficient.");
        }
        else{
            balance=balance-amount; 
            System.out.println("Amount withdrawn successfully.");
            System.out.println("Balance: "+balance);
        }
    }

    public void Print_details(){
        System.out.println();
        System.out.println("Account HolderName: "+AccountHolder);
        System.out.println("Account number: "+AccountNumber);
        System.out.println("Balance: "+balance);
        System.out.println();
    }


    public static void main(String [] args){
        Bank Holder1=new Bank("Vasu",123,50000); 
        Holder1.Print_details();
        Holder1.Deposit(1000);
        Holder1.withdraw(1500);
    }

    
}
