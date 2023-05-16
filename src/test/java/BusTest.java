import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person1;
    private Person person2;


    @Before
    public void setUp(){
        this.bus = new Bus("Edinburgh Castle", 50);
        this.person1= new Person();
        this.person2= new Person();
    }
    @Test
    public void numberOfPassengers(){
        assertEquals(0, bus.getPassengersCount());
    }
    @Test
    public void canAddPassengers(){
        this.bus.addPassengers(person1);
        this.bus.addPassengers(person1);
        assertEquals(2, bus.getPassengersCount());
    }
    @Test
    public void canRemovePassengers(){
        this.bus.addPassengers(person1);
        this.bus.addPassengers(person2);
        this.bus.removePassengers(person1);
        assertEquals(1,bus.getPassengersCount());
    }

}
