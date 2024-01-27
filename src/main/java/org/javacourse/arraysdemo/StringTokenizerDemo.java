package org.javacourse.arraysdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("My,Nam,is,Java,Batch",",");

        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

    }
}
