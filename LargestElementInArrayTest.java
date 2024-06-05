import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestElementInArrayTest {

    @Test
    public void testFindLargestElement() {
        int[] arr = {3, 7, 2, 10, 1};
        int largest = LargestElementInArray.findLargestElement(arr);
        assertEquals(10, largest, "Largest element should be 10");
    }

    @Test
    public void testFindLargestElementEmptyArray() {
        int[] arr = {};
        try {
            LargestElementInArray.findLargestElement(arr);
        } catch (IllegalArgumentException e) {
            assertEquals("Array must not be empty or null", e.getMessage(), "Exception message should match");
        }
    }
}

