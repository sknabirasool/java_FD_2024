package org.javacourse.arraysdemo;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str="Java Programming";

        /**
         * length method used to calculate the length of the String
         */
        System.out.println("String Length is "+str.length());

        /**
         * CharAt method is used to find the position of a character
         */
        System.out.println(str.charAt(3));

        /**
         * Substring index 0 to 4
         */
        System.out.println(str.substring(6));
        System.out.println(str.substring(1,4));

        /**
         * Convert to UpperCase Letters
         */
        System.out.println(str.toUpperCase());

        /**
         * Convert to Lower Case
         */

        System.out.println(str.toLowerCase());

        /**
         * trim method is used to remove the space and trailing spaces
         */
        System.out.println(str.trim());

        /**
         * replace method is used to replace the string
         */

        System.out.println(str.replace("Java","Python"));

        /**
         * check start with
         */

        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("g"));

        /**
         * index of
         */
        System.out.println(str.indexOf("J"));



    }
}
