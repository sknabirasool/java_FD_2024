package org.javacourse.controlstatement;

public class BreakContinueDemo {
    public static void main(String[] args) {

        for (int i=0;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            if (i==8)
            {
               break;
            }
            System.out.println(i);
        }

        System.out.println("hello");
    }
}
