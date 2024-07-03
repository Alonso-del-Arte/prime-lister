package org.oeis.primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testframe.api.Test;
import static org.testframe.api.Asserters.*;

public class EratosthenesSieveTest {

    private static void assertPrime(int p) {
        if (p == -2 || p == 2) return;
        if (p % 2 == 0) {
            String message = "Number " + p 
                    + " is said to be prime but it's even and composite";
            fail(message);
        }
        double squareRoot = Math.sqrt(Math.abs(p));
        for (int d = 3; d < squareRoot; d += 2) {
            boolean notDivisible = p % d != 0;
            String message = "Number " + p 
                    + " is said to be prime, it should not be divisible by " 
                    + d;
            assert notDivisible : message;
        }
    }
    
    /**
     * Test of the listPrimes function, of the EratosthenesSieve class.
     */
    @Test
    public void testListPrimes() {
        System.out.println("listPrimes");
        int threshold = 10;
        Integer[] smallPrimes = {2, 3, 5, 7};
        List<Integer> expected = Arrays.asList(smallPrimes);
        List<Integer> actual = EratosthenesSieve.listPrimes(threshold);
        assertContainsSame(expected, actual);
    }
    
}

