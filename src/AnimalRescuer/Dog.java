package AnimalRescuer;

public class Dog {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRacee() {
        return race;
    }

    public void setRacee(String race) {
        this.race = race;
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

    public double healthStatusScale() {
        return healthStatusScale;
    }

    public void healthStatusScale(int healthStatusScale) {
        this.healthStatusScale = healthStatusScale;
    }

    public double hungerStatusScale() {
        return hungerStatusScale;
    }

    public void hungerStatusScale(int hungerStatusScale) {
        this.hungerStatusScale = hungerStatusScale;
    }

    public double spiritStatusScale() {
        return spiritStatusScale;
    }

    public void spiritStatusScale(int spiritStatusScale) {
        this.spiritStatusScale = spiritStatusScale;
    }

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
