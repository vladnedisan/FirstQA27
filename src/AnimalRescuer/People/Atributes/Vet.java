package AnimalRescuer.People.Atributes;

import AnimalRescuer.People.Atributes.Atributes;

public class Vet extends Atributes {
    private String specialiezed;

    public String getSpecialiezed() {
        return specialiezed;
    }

    public void setSpecialiezed(String specialiezed) {
        this.specialiezed = specialiezed;
    }

    public void talk() {
        System.out.println("Hello, nice to see you again");
    }

}
