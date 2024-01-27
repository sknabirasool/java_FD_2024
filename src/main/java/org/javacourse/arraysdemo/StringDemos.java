package org.javacourse.arraysdemo;

public class StringDemos {
    public static void main(String[] args) {
        /**
         * how many way to create String 2 ways
         * string literal
         * New Keyword
         */
        String str="Welocome";

//        String str1=str.concat("to Java Batch");
//
//        System.out.println(str1);

//        String str1=new String("Hello Java");
//
//        System.out.println(str);
//        System.out.println(str1);

        /**
         * String equals Method
         */
//        String database="sknabirasool104@gmail.com";
//        String str2="SKNABIRASOOL104@GMAIL.COM";
//
//        if(database.equalsIgnoreCase(str2))
//        {
//            System.out.println("login Success");
//        }else {
//            System.out.println("Failed To Login");
//        }

        /**
         * == operator used for reference
         *
         */
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        String str4=new String("Hello");
        if(str3==str4) {
            System.out.println("Same");
        }else {
            System.out.println("not same");
        }

//        String a1="CDA";
//        String a2="ABC";
//        System.out.println(a1.compareTo(a2));

//        String abc="AAA";//65 A-Z=65
//        String cde="AAA";//69
//
//        System.out.println(abc.compareTo(cde));

        String ac_first_name="VINAY";
        String ac_last_name="ABC";

        String full_name=ac_first_name + ac_last_name;


        String  full_name1=ac_last_name.concat(ac_last_name);

        System.out.println(50+100+"Data"+500+100);//150Data500100

        System.out.println(full_name1);

        System.out.println(full_name);



    }
}
