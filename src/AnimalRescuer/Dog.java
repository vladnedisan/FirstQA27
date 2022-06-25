package AnimalRescuer;

public class Dog {
    int age = 10;
    String race = "buldog";
    String name = "Ralph";
    String color = "gray";
    double weight = 10.5;
    int heightCm = 20;
    int healthStatusScale = 6;
    int hungerStatusScale = 9;
    int spiritStatusScale = 10;

    public void eat() {
        System.out.println("eating dog food");
    }

    public void sleep() {
        System.out.println("Snores..zzzz");
    }

    public void speak() {
        System.out.println("Ham!");
    }

    public void play() {
        System.out.println("fetch");
    }

    public void waveTail() {
        System.out.println("waving the tail");
    }
}
