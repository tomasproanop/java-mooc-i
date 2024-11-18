
import java.util.ArrayList;

public class BirdData {

    private ArrayList<Bird> birdList;

    public BirdData() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird) {

        birdList.add(bird);

    }

    public void printBirdDatabase() {

        for (Bird e : birdList) {
            System.out.println(e);
        }

    }

    public void printBird(String name) {

        for (Bird e : birdList) {

            if (e.getName().equals(name)) {

                System.out.println(e);
            }
        }
    }

    public void addObservation(String name) {

        for (Bird e : birdList) {
            if (e.getName().toLowerCase().equals(name.toLowerCase())) {
                e.addObservation();
            }
        }
    }
}