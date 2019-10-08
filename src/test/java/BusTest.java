import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Haymarket", 2);
        person = new Person();
        busStop = new BusStop("Usher Hall");
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
    }

    @Test
    public void busHasDestination(){
        assertEquals("Haymarket", bus.getDestination());
    }

    @Test
    public void numberOfPassengersOnBus(){
        bus.pickUpPassengerFromBusStop(busStop);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void testBusCanPickUpPersonFromBusStop(){
        bus.pickUpPassengerFromBusStop(busStop);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void passengerCanLeaveBus(){
        bus.pickUpPassengerFromBusStop(busStop);
        bus.pickUpPassengerFromBusStop(busStop);
        bus.removePassenger(person);
        assertEquals(1, bus.getPassengers());
    }

}
