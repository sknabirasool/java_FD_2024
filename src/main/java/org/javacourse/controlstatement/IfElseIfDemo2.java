package org.javacourse.controlstatement;

import java.time.LocalTime;

public class IfElseIfDemo2 {
    public static void main(String[] args) {
        LocalTime currenttime=LocalTime.now();
        System.out.println(currenttime);
        int currenthour=currenttime.getHour();
        System.out.println(currenthour);
        if(currenthour < 12)
        {
            System.out.println("Good Morning Session");
        }else if(currenthour < 18){
            System.out.println("Good Afternoon");
        }else {
            System.out.println("Good evening");
        }

    }
}
