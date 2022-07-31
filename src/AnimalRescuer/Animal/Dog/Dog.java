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
   }

