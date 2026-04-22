package app;
import java.util.*;

public class TrainConsistManagementApp {

    // Safety validation using Streams
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {
        return bogies.stream().allMatch(bogie ->
                !bogie.getType().equalsIgnoreCase("Cylindrical") ||
                        bogie.getCargo().equalsIgnoreCase("Petroleum")
        );
    }

    public static void main(String[] args) {
        List<GoodsBogie> bogies = new ArrayList<>();

        // Sample input
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean isSafe = isTrainSafe(bogies);

        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}