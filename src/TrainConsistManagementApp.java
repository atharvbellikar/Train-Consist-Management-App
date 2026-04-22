import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {


    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("===============================================\n");


        Map<String, Integer> bogieCapacityMap = new HashMap<>();


        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100);


        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nNote:");
        System.out.println("HashMap stores bogies as keys and capacities as values.");
        System.out.println("Allows fast lookup and efficient data management.");

        System.out.println("\nUC6 mapping setup completed...");
    }
}