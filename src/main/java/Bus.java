import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person>passengers;


    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }
    public int getPassengersCount(){
        return this.passengers.size();
    }

    public void addPassengers(Person person) {
        if (getPassengersCount() < this.capacity){
        this.passengers.add(person);}
    }
    public void removePassengers(Person person){
        this.passengers.remove(person);
    }
}
