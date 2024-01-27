package org.javacourse.employees;
import  org.javacourse.account.MyAccount;

public class Employee {
    public void add(){
        System.out.println("I am from Employee package inside employee Classs");
    }

    public static void main(String[] args) {

            MyAccount m=new MyAccount();
            m.Account();
    }

}

