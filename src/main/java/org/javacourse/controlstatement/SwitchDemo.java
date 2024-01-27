package org.javacourse.controlstatement;

public class SwitchDemo {
    public static void main(String[] args) {
        int day=2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("TuesDay");
                break;
            case 3:
                System.out.println("wen Day");
                break;
            default:
                System.out.println("Not Found Option");
        }
    }
}
