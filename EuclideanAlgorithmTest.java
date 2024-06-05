package ttooll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanAlgorithmTest {

    @Test
    public void testFindGCD() {
        int gcd = EuclideanAlgorithm.findGCD(48, 18);
        assertEquals(6, gcd, "GCD of 48 and 18 should be 6");
    }

    @Test
    public void testFindGCDWithZero() {
        int gcd = EuclideanAlgorithm.findGCD(35, 0);
        assertEquals(35, gcd, "GCD with 0 should be the number itself");
    }
}
