package Jobsheet1;

public class DragonMain {
    public static void main(String[] args) {
        Dragon d1 = new Dragon();
        Dragon d2 = new Dragon();

        System.out.println("Dragon 1");
        d1.move(5);
        d1.status();
        d1.changeDirection(2);
        d1.move(10);
        d1.status();

        System.out.println("Dragon 2");
        d2.move(7);
        d2.status();
        d2.changeDirection(4);
        d2.move(10);
        d2.status();
        
    }
}
