package AnimalRescuer;

public class DogFood {
    String nameFood;
    int quantity ;
    int price ;
    boolean availability;


    public String nameFood() {
        return nameFood;
    }

    public void setAdopterName(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
