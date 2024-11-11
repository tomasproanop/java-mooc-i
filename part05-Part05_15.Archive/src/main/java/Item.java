public class Item {

    private String id;
    private String name;

    public Item(String name, String id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        if (this.id.equals(comparedItem.id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
    
}
