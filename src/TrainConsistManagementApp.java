import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create HashSet for bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);
    }
}