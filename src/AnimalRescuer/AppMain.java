package AnimalRescuer;

import AnimalRescuer.Activity.Recreation;
import AnimalRescuer.Animal.Birds.Parrot;
import AnimalRescuer.Animal.Cat.RussianBlue;
import AnimalRescuer.Animal.Dog.Dog;
import AnimalRescuer.Animal.Dog.Labrador;
import AnimalRescuer.Food.DogFood.DryFood;
import AnimalRescuer.Food.DogFood.WetFood;
import AnimalRescuer.People.Atributes.Adopter;
import AnimalRescuer.People.Atributes.Vet;

public class AppMain {

    public static void main(String[] args) {
        Dog ralph = new Dog();
        ralph.setName("Burcus");
        System.out.println("Dog's name is: " + ralph.getName());
        System.out.print("Dog is playing: ");
        ralph.play();
        Dog rex = new Dog();
        rex.setName("Rex");
        System.out.println("New dog name is : " + rex.getName());
        System.out.print("Dog is playing: ");
        rex.play();
        Labrador  grivey = new Labrador();
        grivey.setName("Grivey");
        System.out.println("New dog's name is " + grivey.getName());
        grivey.setHealthStatusScale(5);
        grivey.setHungerStatusScale(5);
        grivey.setSpiritStatusScale(3);
        System.out.println("Hunger status scale is: " + grivey.getHealthStatusScale());
        System.out.println("Health status scale is: " + grivey.getHungerStatusScale());
        grivey.eat();
        System.out.println("Spirit status scale is: " + grivey.getSpiritStatusScale());
        grivey.play();

        Adopter person = new Adopter();
        person.setName("Pop Mihai");
        System.out.println("Adopter name is: " + person.getName());
        person.talk();
        person.setWorkingStatus("employed");
        System.out.println("Adopter status  is: " + person.getWorkingStatus());
        person.setAdoption(1);
        System.out.println("THe number of adoptions from this adopter so far is  " + person.getAdoption());

        Recreation activity = new Recreation();
        System.out.print("Dog's activity is: ");
        activity.running();
        System.out.print("Dog's activity is: ");
        activity.sleeping();
        System.out.print("Dog's activity is: ");
        activity.swimming();
        Vet doctor = new Vet();
        doctor.talk();
        doctor.setName("Pop Vasile");
        System.out.println("My name is dr.  " + doctor.getName());
        doctor.setSpecialiezed("Surgeon");
        System.out.println("My speciality is: " + doctor.getSpecialiezed());
        DryFood dryFood = new DryFood();
        dryFood.setNameFood("Wellness");
        System.out.println("Best dry food for dogs is :  " + dryFood.getNameFood());
        dryFood.setStorage("Container");
        System.out.println("Best way to keep the dry food fresh is in a  :  " + dryFood.getStorage());
        WetFood wetFood = new WetFood();
        wetFood.setNameFood("Brit Mono");
        System.out.println("Best wet food for dogs is :  " + wetFood.getNameFood());
        wetFood.setRecipent("Can");
        System.out.println("Best way to keep the wet food fresh is in a unopened :  " + wetFood.getRecipent());
        RussianBlue bella = new RussianBlue();
        bella.setName("Kitty");
        System.out.println("Cat name is: " + bella.getName());
        bella.eat();
        bella.play();
        bella.speak();
        Parrot birdie = new Parrot();
        birdie.setName("Abby");
        System.out.println("Parrot name is: " + birdie.getName());
        birdie.speak();
        birdie.play();
        //  Duck ducky = new Duck();
        //  ducky.setName("Ducky");
        // ducky.sleep();


    }
}

