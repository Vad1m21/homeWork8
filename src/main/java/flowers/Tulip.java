package flowers;

public class Tulip extends Flower {

    private  Integer tulipPrice = 45;

    public Tulip() {
    }

    public Integer getTulipPrice() {
        return tulipPrice;
    }

    public void setTulipPrice(Integer tulipPrice) {
        this.tulipPrice = tulipPrice;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "tulipPrice=" + tulipPrice +
                '}';
    }
}
