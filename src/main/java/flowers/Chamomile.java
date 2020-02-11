package flowers;

public class Chamomile extends Flower {



    private  Integer chamomilePrice = 70;


    public Chamomile() {
    }

    public Integer getChamomilePrice() {
        return chamomilePrice;
    }

    public void setChamomilePrice(Integer chamomilePrice) {
        this.chamomilePrice = chamomilePrice;
    }

    @Override
    public String toString() {
        return "Chamomile{" +
                "chamomilePrice=" + chamomilePrice +
                '}';
    }
}
