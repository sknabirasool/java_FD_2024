package org.javacourse.datatypes;
public class LocalvariablesDemo {
    public double calculateArea(double length, double breadth)
    {
        double area=length*breadth;
        return area;
    }
    public static void main(String[] args) {
        LocalvariablesDemo obj=new LocalvariablesDemo();
        double len=30.0;
        double brd=32.0;
        double res=obj.calculateArea(len,brd);
        System.out.println("Area of the Rectangle is "+res);

    }
}
