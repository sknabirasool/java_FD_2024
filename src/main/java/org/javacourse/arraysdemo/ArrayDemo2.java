package org.javacourse.arraysdemo;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int age[]={20,40,60,70,50};
        int sum=0;

        for (int i=0;i< age.length;i++)
        {
            sum=sum+age[i];
        }
        System.out.println(sum);
    }
}
