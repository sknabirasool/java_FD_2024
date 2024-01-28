package org.javacourse.opps;

class Account{
    String accountNumber;
    double balance;
    public Account(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayAccountInfo()
    {
        System.out.println("Account Number is "+accountNumber+" Account Balance"+balance);
    }

    public void Transaction(double amount){
        balance+=amount;
        System.out.println("Transaction is Completed New Balance is "+balance);
    }
}
class SavingAccount extends Account{
    double interest;
   public SavingAccount(String accountNumber, double balance, double interest){
        super(accountNumber,balance);
        this.interest=interest;
    }

    public  void displaySavingAccountInfo()
    {
        displayAccountInfo();
        System.out.println("Interest Rate"+interest+ "%");
    }
//    public  void addInterest()
//    {
//        double interest=balance*(interest/100);
//        balance += interest;
//        System.out.println("Intrest added new Balance"+balance);
//    }
}


public class BankExample {
    public static void main(String[] args) {

        SavingAccount mySavingAccount=new SavingAccount("57773727227",20000.0,2.8);
        mySavingAccount.displaySavingAccountInfo();
        mySavingAccount.Transaction(1000);
//        mySavingAccount.addInterest();
    }
}
