package AnimalRescuer.Animal;

public abstract class Animal {
    private int age;
    private String race;
    private String name;
    private String color;
    private double weight;
    private int heightCm;
    private int healthStatusScale;
    private int hungerStatusScale;
    private int spiritStatusScale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {

        this.race = race;
    }

    public int getHeightCm() {

        return heightCm;
    }

    public void setHeightCm(int heightCm) {

        this.heightCm = heightCm;
    }

    public int getHealthStatusScale() {

        return healthStatusScale;
    }

    public void setHealthStatusScale(int healthStatusScale) {

        this.healthStatusScale = healthStatusScale;
    }

    public int getHungerStatusScale() {

        return hungerStatusScale;
    }

    public void setHungerStatusScale(int hungerStatusScale) {

        this.hungerStatusScale = hungerStatusScale;
    }

    public int getSpiritStatusScale() {
        return spiritStatusScale;
    }

    public void setSpiritStatusScale(int spiritStatusScale) {
        this.spiritStatusScale = spiritStatusScale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //  public abstract void eat(); //{
    // System.out.println("eating dog food");
    //}
    //public void sleep() {
    //   System.out.println("Snores..zzzz");
    // }
    // public void speak() {
    //    System.out.println("Ham!");
    // }
    public abstract void sound();

    public abstract void play();

    public abstract void eat();

    public abstract void sleep();
}
