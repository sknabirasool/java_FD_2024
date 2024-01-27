package org.javacourse.methods;
import java.util.Scanner;
class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolder + " | Account Balance: " + balance);
    }
}
public class BankAccountCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount myAccount=createAccount(sc);
        myAccount.displayAccountInfo();
        sc.close();
    }
    private static BankAccount createAccount(Scanner sc)
    {
        System.out.println("Enter The Account Holder Name");
        String name=sc.nextLine();
        System.out.println("Enter The Bank Balance");
        double bal=sc.nextDouble();
        return  new BankAccount(name,bal);

    }

}
