package AnimalRescuer.People.Atributes;

import AnimalRescuer.People.Atributes.Atributes;

public class Adopter extends Atributes {

    public String workingStatus;
    public int adoption;
    int moneyRon;

    public int getAdoption() {
        return adoption;
    }

    public void setAdoption(int adoption) {
        this.adoption = adoption;
    }

    public String getWorkingStatus() {
        return workingStatus;
    }

    public void setWorkingStatus(String workingStatus) {
        this.workingStatus = workingStatus;
    }

    public int getMoneyRon() {
        return moneyRon;
    }

    public void setMoneyRon(int moneyRon) {
        this.moneyRon = moneyRon;
    }
    public void talk() {
        System.out.println("Good Morning! Vorbiti si romaneste?");
    }
}

