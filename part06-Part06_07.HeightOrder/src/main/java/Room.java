import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons; 

    public Room() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        //add the person passed as a paramter to the list.
        persons.add(person);
    }

    public boolean isEmpty() {
        //- returns a boolean-type value true or false, that tells whether the room is empty or not.
        if(persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
    //- returns a list of the persons in the room.
        return persons;
    }

    public Person shortest(){

        // return a null reference if there's no one 
        if (this.persons.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.persons.get(0);

        // go through the list
        for (Person person: this.persons) {

            if (person.getHeight() < returnObject.getHeight()) {
                // if we find a taller person in the comparison,
                // we assign it as the value of the returnObject
                returnObject = person;
            }
        }
        // finally, the object reference describing the
        // return object is returned
        return returnObject;
    }

    public Person take(){

        if(persons.isEmpty()){
            return null;
        } else {
            Person shortPerson = shortest();
            persons.remove(shortest());
            return shortPerson;
        }
    }
}
