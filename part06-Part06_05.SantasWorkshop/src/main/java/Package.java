import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {

        gifts = new ArrayList<>();
        
    }

    public void addGift(Gift gift) {

        gifts.add(gift);

    }

    public int totalWeight(){

        int total = 0;

        for (Gift g : gifts) {
            total = total + g.getWeight();
        }
        return total;
    }
}
