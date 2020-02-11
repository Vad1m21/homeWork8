package flowers;

import com.fasterxml.jackson.annotation.JsonRootName;


public class Rose extends Flower {

    private Integer rosePrice = 100;

    public Rose() {

    }

    public Integer getRosePrice() {
        return rosePrice;
    }

    public void setRosePrice(Integer rosePrice) {
        this.rosePrice = rosePrice;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "rosePrice=" + rosePrice +
                '}';
    }
}
