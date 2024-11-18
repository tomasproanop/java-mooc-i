import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;
    private int totalWeight;

    public Suitcase(int maximumWeight){
        items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight(){

        totalWeight = 0;

        for(Item item : items){
            totalWeight = totalWeight + item.getWeight();
        }

        return totalWeight;
    }


    public void addItem(Item item){
        if((item.getWeight() + this.totalWeight()) <= maximumWeight){
            items.add(item);
        } else {

        }
    }

    public String toString(){

        if(this.items.isEmpty()){
            return "no items (0 kg)";
        } else if (this.items.size() == 1){
            return "1 item (" + totalWeight() + "kg)";
        } else {
            return this.items.size() + " items (" + totalWeight() + "kg)";
        }
    }

    public void printItems(){

        for (Item item : items){
            System.out.println(item);
        }

    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;

        }

        Item heaviestItem = this.items.get(0);

        for (Item e : items) {

            if (e.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = e;
            }
        }
        return heaviestItem;

    }
}
