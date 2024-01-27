package org.javacourse.opps;

public class Student {

    public Student()
    {

    }

    {
        System.out.println("Hello");
    }
    int id=120;
    String name="Vinay";
    int marks=300;

    public void read()
    {
        System.out.println(" reading");
    }

    public static void main(String[] args) {

        Student obj=new Student();

        System.out.println(" id is "+obj.id);
        obj.read();


    }
}
