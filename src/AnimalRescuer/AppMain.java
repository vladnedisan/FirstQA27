package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Dog ralph = new Dog();
        System.out.println("Dog's name is: " + ralph.name);
        System.out.println("Dog is playing: ");
        ralph.play();
        System.out.println("Hunger status scale is: " + ralph.hungerStatusScale);
        System.out.println("Health status scale is: " + ralph.healthStatusScale);
        System.out.println("Spirit status scale is: " + ralph.spiritStatusScale);

        Adopter person = new Adopter();
        System.out.println("Adopter name is: " + person.adopterName);

        Recreation activity = new Recreation();
        System.out.println("Dog's activity is: ");
        activity.running();
        activity.sleeping();
        activity.swimming();

        Vet doctor = new Vet();
        System.out.println("Vet name is: " + doctor.vetName);
        System.out.println("Vet speciality is: " + doctor.specialized);
    }
}
