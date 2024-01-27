package org.javacourse.controlstatement;

import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        int bal=50,withdraw,deposit;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Automatic Teller Machine");
            System.out.println("choose 1 for Withdraw");
            System.out.println("choose 2 for Deposit");
            System.out.println("choose 3 check balance");
            System.out.println("choose 4 exit");

            int ops=scanner.nextInt();
            switch (ops){
                case 1:
                    System.out.println("Enter withdraw amount");
                    withdraw=scanner.nextInt();//100
                    if(bal>=withdraw)
                    {
                        bal=bal-withdraw;
                        System.out.println("Please collect your amount");
                    }else {
                        System.out.println("insufficient balance");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter Amount to deposit");
                    deposit=scanner.nextInt();///200
                    bal=bal+deposit;
                    System.out.println("your money deposit successfully");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance is "+bal);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
