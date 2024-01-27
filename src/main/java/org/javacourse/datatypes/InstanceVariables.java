package org.javacourse.datatypes;

public class InstanceVariables {
    int age=20;

    static  int b=22;
    static  String name1="Babu";

    String name="Shaik";
    public int id=20;

    public  static void run()
    {
        System.out.println("running");
    }
    public static void main(String[] args) {
        InstanceVariables obj=new InstanceVariables();
        System.out.println("My id is "+obj.id+" name "+obj.name);
        System.out.println("my id is"+b+" my name is"+name1);

       run();
    }
}
