import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20Test {

    @Test
    void testValidation_EmptyArrayThrowsException() {
        String[] emptyIds = {};
        // Verifies that IllegalStateException is thrown
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            main.searchWithValidation(emptyIds, "BG101");
        });

        // Verifies the error message is meaningful
        assertEquals("Search failed: No bogies available in the train consist.", exception.getMessage());
    }

    @Test
    void testValidation_NullArrayThrowsException() {
        assertThrows(IllegalStateException.class, () -> {
            main.searchWithValidation(null, "BG101");
        });
    }

    @Test
    void testValidation_ValidArrayDoesNotThrow() {
        String[] ids = {"BG101", "BG205"};
        assertDoesNotThrow(() -> {
            main.searchWithValidation(ids, "BG101");
        });
    }

    @Test
    void testValidation_SearchLogicStillWorks() {
        String[] ids = {"BG101", "BG205"};
        assertTrue(main.searchWithValidation(ids, "BG205"));
        assertFalse(main.searchWithValidation(ids, "BG999"));
    }
}