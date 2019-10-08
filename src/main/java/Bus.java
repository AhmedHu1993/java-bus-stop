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


    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUpPassengerFromBusStop(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();

        if (this.passengers.size() < this.capacity){
            this.passengers.add(person);
        }

    }
}
