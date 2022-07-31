package AnimalRescuer.Animal.Birds;

import AnimalRescuer.Animal.Animal;

public class Birds extends Animal {
    @Override
    public void eat() {
        System.out.println("worms");
    }

    @Override
    public void sleep() {
        System.out.println("all winter");
    }

    @Override
    public void sound() {
        System.out.println("cip cirip");
    }

    @Override
    public void play() {
        System.out.println("with other birds");
    }
}
