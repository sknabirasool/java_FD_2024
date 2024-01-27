package org.javacourse.opps;

public class PersonConstructor {
    private String name;
    private int age;
    private int no;
    public PersonConstructor()
    {
        this.name="Unkown";
        this.age=0;
    }
    public PersonConstructor(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public PersonConstructor(String name,int age,int no)
    {
        this.name=name;
        this.age=age;
        this.no=no;
    }
    public void display()
    {
        System.out.println("Name "+name+ " age "+age+" no "+no);
    }

    {
        System.out.println("Hello Staic block");
    }

    public static void main(String[] args) {
        PersonConstructor obj=new PersonConstructor();
        PersonConstructor obj1=new PersonConstructor("CHANDAN",23);
        PersonConstructor obj2=new PersonConstructor("CHANDAN",23,300);

        obj.display();
        obj1.display();
        obj2.display();

    }

}
