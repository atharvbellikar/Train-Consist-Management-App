import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase17Test {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] input = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        String[] expected = {"AC Chair", "First Class", "General", "Luxury", "Sleeper"};
        main.sortBogieNames(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testSort_UnsortedInput() {
        String[] input = {"Luxury", "General", "Sleeper", "AC Chair"};
        String[] expected = {"AC Chair", "General", "Luxury", "Sleeper"};
        main.sortBogieNames(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] input = {"AC Chair", "First Class", "General"};
        String[] expected = {"AC Chair", "First Class", "General"};
        main.sortBogieNames(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] input = {"Sleeper", "AC Chair", "Sleeper", "General"};
        String[] expected = {"AC Chair", "General", "Sleeper", "Sleeper"};
        main.sortBogieNames(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testSort_SingleElementArray() {
        String[] input = {"Sleeper"};
        String[] expected = {"Sleeper"};
        main.sortBogieNames(input);
        assertArrayEquals(expected, input);
    }
}