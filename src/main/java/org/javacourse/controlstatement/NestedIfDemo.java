package org.javacourse.controlstatement;

public class NestedIfDemo {
    public static void main(String[] args) {

        int score=90;

        if(score<=50) {
            System.out.println("Yes Passed");
            if(score>=90){
                System.out.println("Congrats!");
            }else {
                System.out.println("Sorry, you failed");
            }
        }else {
            System.out.println("Your are Failed");
        }

    }
}
