package org.javacourse.arraysdemo;

import java.util.Scanner;

public class ArrayDyanmicvalues {
    public static void main(String[] args) {
        int n;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Element do you want store");
        n=sc.nextInt(); //4
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements");


    }
}
