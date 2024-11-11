
public class HealthStation {

    private int counter;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        counter = counter + 1;
        return person.getWeight();
    }

    public void feed(Person person){
        int weight = person.getWeight();
        int newWeight = weight + 1;
        person.setWeight(newWeight);
    }

    public int weighings(){
        return counter;
    }

}
