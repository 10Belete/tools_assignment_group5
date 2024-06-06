public class LargestPrimeFactor {

    public static long calculateLargestPrimeFactor(long number) {
        long maxPrime = -1;

        // Remove all the 2s as factors
        while (number % 2 == 0) {
            maxPrime = 2;
            number /= 2;
        }

        // Find other factors
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number /= i;
            }
        }

        // If the remaining number is a prime greater than 2
        if (number > 2) {
            maxPrime = number;
        }

        return maxPrime;
    }
}
