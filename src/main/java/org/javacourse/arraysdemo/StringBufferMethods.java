package org.javacourse.arraysdemo;

public class StringBufferMethods {
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.append("Java"));
        System.out.println(sb.insert(4,"Rasool"));
        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(4));
//        System.out.println(sb.reverse());
        System.out.println(sb.replace(3,6,"ABC"));
        System.out.println(sb.delete(3,6));

    }
}
