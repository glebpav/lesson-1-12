import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cat - класс
        // cat1/cat2 - объекты класса Cat
        // При создании объектов необходимо выделять память

        /*Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 5;
        cat1.name = "Barsik";

        cat2.age = 12;
        cat2.name = "Murka";

        System.out.println("For cat1");
        cat1.getVoice();
        cat1.getInfo();

        System.out.println("\nFor cat2");
        cat2.getVoice();
        cat2.getInfo();*/

        Dog dog1 = new Dog(14, "Jack", 2.5);

        dog1.getInfo();

    }
}