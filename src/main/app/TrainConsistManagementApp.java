package app;

import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Loop-based filtering
    public static List<PassengerBogie> filterWithLoop(List<PassengerBogie> bogies) {
        List<PassengerBogie> result = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream-based filtering
    public static List<PassengerBogie> filterWithStream(List<PassengerBogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        // sample data
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 50));
        bogies.add(new PassengerBogie("First Class", 80));

        // Loop timing
        long startLoop = System.nanoTime();
        List<PassengerBogie> loopResult = filterWithLoop(bogies);
        long endLoop = System.nanoTime();

        // Stream timing
        long startStream = System.nanoTime();
        List<PassengerBogie> streamResult = filterWithStream(bogies);
        long endStream = System.nanoTime();

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");
    }
}