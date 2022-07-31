package AnimalRescuer.Animal.Cat;

import AnimalRescuer.Animal.Animal;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("mouse");
    }

    @Override
    public void sleep() {
        System.out.println("under the sun");
    }

    @Override
    public void sound() {
        System.out.println("miau");
    }

    @Override
    public void play() {
        System.out.println("with feather");
    }
}