package org.javacourse.arraysdemo;
public class ArraysDemo3 {
    public static void main(String[] args) {
        int[] arr={13,12,45,68,56};
        ArraysDemo3 data=new ArraysDemo3();
        data.PrintArray(arr);
    }
    public void PrintArray(int[] array)
    {
        for (int i=0;i< array.length;i++)
        {
            if(array[i]%2==0)
            {
                System.out.println("Even Number"+array[i]);
            }else if(array[i]%2==1){
                System.out.println("odd Number"+array[i]);
            }
        }
    }
}
