package org.javacourse.datatypes;

public class ArthamaticOps {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Addition"+(a+b));
        System.out.println("Addition"+(a-b));
        System.out.println("Addition"+(a*b));
        System.out.println("Addition"+(a/b));
        System.out.println("Addition"+(a%b));

        /**
         *
         * Relational Operators Example
         */
        System.out.println("************************");
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);

        System.out.println("---------------");
        System.out.println((5>3)&&(8>5));// 5>3 (true) && 8>5(true)
        System.out.println((5>3)&&(8<5));// 5>3 (true) && 8>5(false)

        System.out.println((5<3)||(8>5));//false || true
        System.out.println((5<3)||(8<5));//true || false

        /**
         * Assignment operators
         */

        System.out.println("Assignment ops");

        System.out.println(a=b);
        int c=a+a+a;
        System.out.println(c);
        c=a-b;
        System.out.println(c);
        c=a*b;
        System.out.println(c);

        /**
         * ternaty operator
         * variable=exp1?true:false
         */
        int data=10;
        int y=20;
//        int min= (x<y)?x:y;   //(10<20)?true:false
//        System.out.println(min);

        /**
         * increment and decrement demo
         */
        System.out.println("increment and decrement");
        System.out.println(data);
        ++data;//data=data+1;//11
        System.out.println(data);
        --data;
        System.out.println(data);

        for(int i=0;i<=100;i++)
        {
            System.out.println("Hello "+i);
        }


        /**
         *
         * 1. variables local insance variable static variables program 3 factroal reverse number
         * 2.operators
         *
         */

















    }
}
