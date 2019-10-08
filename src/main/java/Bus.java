import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public String getDestination() {
        return this.destination;
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(this.passengers.size() < capacity){
            this.passengers.add(person);
        }
    }


    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }
}