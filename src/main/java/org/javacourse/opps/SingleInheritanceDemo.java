package org.javacourse.opps;



class Father{
    String color="white";
    public void foodie()
    {
        System.out.println("Father is super foodie");
    }
}
class  Child extends Father{
    int height=6;
    public  void games()
    {
        System.out.println("child is intrested games");
    }
}
public class SingleInheritanceDemo {

    public static void main(String[] args) {

        Child c=new Child();

        System.out.println(" Father color is "  +c.color);
        c.foodie();
        System.out.println("Child height "+c.height);
        c.games();
    }
}
