package test;

import app.PassengerBogie;
import app.TrainConsistManagementApp;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainconsistManagementAppTest {

    @Test
    void testLoopFilteringLogic() {
        List<PassengerBogie> bogies = Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 50)
        );

        List<PassengerBogie> result = TrainConsistManagementApp.filterWithLoop(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<PassengerBogie> bogies = Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 50)
        );

        List<PassengerBogie> result = TrainConsistManagementApp.filterWithStream(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<PassengerBogie> bogies = Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("First Class", 80),
                new PassengerBogie("AC Chair", 50)
        );

        List<PassengerBogie> loopResult = TrainConsistManagementApp.filterWithLoop(bogies);
        List<PassengerBogie> streamResult = TrainConsistManagementApp.filterWithStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(new PassengerBogie("Sleeper", i));
        }

        long start = System.nanoTime();
        TrainConsistManagementApp.filterWithLoop(bogies);
        long end = System.nanoTime();

        long elapsed = end - start;

        assertTrue(elapsed > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new PassengerBogie("Type", i));
        }

        List<PassengerBogie> result = TrainConsistManagementApp.filterWithStream(bogies);

        assertNotNull(result);
    }
}