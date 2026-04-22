import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 50),
                new Bogie("Sleeper", 72)
        );

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        grouped.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });
    }
}

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

    public String toString() {
        return type + "(" + capacity + ")";
    }
}