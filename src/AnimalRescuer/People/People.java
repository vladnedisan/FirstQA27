package AnimalRescuer.People;

public class People {
    private int age;
    private String name;
    private double weight;
    private int heightCm;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }
    public void talk() {
        System.out.println("Hello, nice to see you again");
    }
}
