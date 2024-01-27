package org.javacourse.account;
import org.javacourse.employees.Employee;
public class MyAccount {

    /**
     * A-Z or a-z or $, _
     *
     */
    int age;
    long acno=345743639090876L;
    String acc_holder_name="S Basha";
    String bankname;
    static int bal=2000;

    /**
     * static block
     */
    static {
        System.out.println("Bank is Under maintances");
    }

    /**
     * Constructor creation
     */

    public  void Account()
    {
        System.out.println(" I am A Account Package inside Account Class");
    }
    public static void main(String[] args) {
        System.out.println("I am a main Method");
        Employee e=new Employee();
        e.add();
        MyAccount  ac=new MyAccount();


        System.out.println("My Ac No "+ac.acno);
        System.out.println("Account Holder Name "+ac.acc_holder_name);
        System.out.println("Account bal is "+bal);

    }


}
