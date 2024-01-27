package org.javacourse.methods;

public class MethodsDemo {
    /**
     * <access-modifier> static return-type method-name parameter-list
     * @param a,b,c
     */

    /**
     * static method
     */
    public static int add(int a,int b,int c)
    {
        int d=a+b+c;
        return d;
    }

    public  static void printData()
    {

        System.out.println("Method is executed");
    }

    /**
     * non-static method
     * @param a
     * @param b
     * @return
     */
    public int sub(int a,int b){
      return a-b;
    }
    public static void main(String[] args) {

        MethodsDemo obj=new MethodsDemo();

        int res=add(10,20,30);
        System.out.println("addition result "+res);
        int res1=obj.sub(10,20);
        System.out.println("sub result"+res1);
        printData();


    }
}
