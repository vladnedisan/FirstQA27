package AnimalRescuer.Animal.Dog;


import AnimalRescuer.Animal.Animal;

public class Dog extends Animal {

    private int fangsLength;
    private int healthStatusScale;

    @Override
    public int getHealthStatusScale() {
        return healthStatusScale;
    }

    @Override
    public void setHealthStatusScale(int healthStatusScale) {
        this.healthStatusScale = healthStatusScale;
    }

    public int getFangsLength() {
        return fangsLength;
    }

    public void setFangsLength(int fangsLength) {
        this.fangsLength = fangsLength;

    }

    public void waveTail() {
        System.out.println("waving the tail");
    }

    @Override
    public void eat() {
        System.out.println("sticks");
    }

    @Override
    public void sleep() {
        System.out.println("snores");
    }

    @Override
    public void sound() {
        System.out.println("bark bark");
    }

    @Override
    public void play() {
        System.out.println("with tenns ball");
    }
}

