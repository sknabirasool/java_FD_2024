package org.javacourse.opps;


class  MyClass{
    static int staticvariable;
    static void staticMethod()
    {
        System.out.println("I am A static methods");
    }
    static {
        System.out.println(" i am a static block");

    }

    static class StaticInnerClass{
        void display()
        {
            System.out.println(" Inside a static inner class");
        }
    }
}
public class StaticExample {
    public static void main(String[] args) {
        System.out.println("Static variable "+MyClass.staticvariable);
        MyClass.staticMethod();
        MyClass.StaticInnerClass obj=new MyClass.StaticInnerClass();
        obj.display();
    }

}
