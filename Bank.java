import java.util.Scanner;

public class Bank{
    String accountNumber;
    String accountHolder;
    double balance;

    //Constructor
    Bank(String accNo,String accHol,double bal){
        accountNumber = accNo;
        accountHolder = accHol;
        balance = bal;
    }

    void deposit(double amount){
       if(amount > 0){
        balance = balance + amount;
        System.out.println("Deposited:"+amount);
       } else{
        System.out.println("Insufficient amount:"+amount);
       }
    }

    void withdraw(double amount){
        if(amount > 0 && amount<=balance){
            balance = balance - amount;
            System.out.println("Withdrawn:"+amount);
        }else{
            System.out.println("insufficient amount");
        }
    }
    
    void display(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Holder:"+accountHolder);
        System.out.println("Balance:"+balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number:");
        String accNo = sc.nextLine();
        System.out.println("Enter the Account holder name:");
        String accHol = sc.nextLine();
        System.out.println("Enter the initial balance:");
        double bal = sc.nextDouble();

        Bank obj = new Bank(accNo,accHol,bal);
        obj.display();

        System.out.println("Enter deposit amount");
        double depamount = sc.nextDouble();
        obj.deposit(depamount);
        obj.display();

        System.out.println("Enter withdrawal amount");
        double withamount = sc.nextDouble();
        obj.withdraw(withamount);
        obj.display();
        sc.close();
    }
}
