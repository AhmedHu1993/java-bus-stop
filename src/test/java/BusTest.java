import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Haymarket", 2);
        person = new Person();
    }

    @Test
    public void busHasDestination(){
        assertEquals("Haymarket", bus.getDestination());
    }

    @Test
    public void numberOfPassengersOnBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void passengerCanBoardBus(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.getPassengers());
    }

    @Test
    public void passengerCanLeaveBus(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.getPassengers());
    }

}
