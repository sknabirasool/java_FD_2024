package org.javacourse.datatypes;

public class DataTypesDemo {

    byte b=127;
    short s=32767;

    int i=2147483647;
    long d=9223372036854775807L;
    float f=22.05f;
    double dou=534979876.0d;

    boolean status=true;

    char c='a';

    public static void main(String[] args) {


        DataTypesDemo data=new DataTypesDemo();
        System.out.println("Byte "+data.b);
        System.out.println("Byte "+data.s);
        System.out.println("Byte "+data.d);
        System.out.println("Byte "+data.status);
        System.out.println("Byte "+data.c);

        char c='A';
        for (int i=0;i<26;i++)
        {
            System.out.print(c);
            c++;
        }

    }
}
