public class Dog {

    int age;
    double lengthOfTail;
    String name;

    Dog(int age, String name, double lengthOfTail) {
        this.age = age;
        this.name = name;
        this.lengthOfTail = lengthOfTail;
    }

    void getVoice() {
        System.out.println("Woof");
    }

    void getInfo() {
        System.out.println("I'm a dog");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Length of tai: " + lengthOfTail);
    }

}
