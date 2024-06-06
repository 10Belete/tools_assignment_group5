import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPrimeFactorTest {

    @Test
    public void testCalculateLargestPrimeFactor() {
        long largestPrimeFactor = LargestPrimeFactor.calculateLargestPrimeFactor(13195);
        assertEquals(29, largestPrimeFactor, "Largest prime factor of 13195 should be 29");
    }

    @Test
    public void testCalculateLargestPrimeFactorWithLargeNumber() {
        long largestPrimeFactor = LargestPrimeFactor.calculateLargestPrimeFactor(600851475143L);
        assertEquals(6857, largestPrimeFactor, "Largest prime factor of 600851475143 should be 6857");
    }
}