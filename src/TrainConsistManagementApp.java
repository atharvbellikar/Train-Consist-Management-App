import java.util.*;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 50),
                new Bogie("First Class", 30),
                new Bogie("Sleeper", 72)
        );

        // Step 2: Calculate total seating capacity using map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Optional: verify original list unchanged
        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);
    }
}