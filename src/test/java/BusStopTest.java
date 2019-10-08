import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Usher Hall");
        person = new Person();
    }

    @Test
    public void testBusStopQueueIsEmpty(){
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void testAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void testRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.getQueue());
    }
}
