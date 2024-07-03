package org.oeis.primes;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class EratosthenesSieve {

    private static int currThresh = 100;
    
    private static final int[] FIRST_25_PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 
        23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    
    /**
     * The list of prime numbers that have been stored so far during the current 
     * session. This is initialized with the first 25 positive primes: 2, 3, 5, 
     * 7, ..., 97.
     */
    private static final List<Integer> PRIMES = new ArrayList<>();
    
    static {
        for (int p : FIRST_25_PRIMES) {
            PRIMES.add(p);
        }
    }
    
    // TODO: Write tests for this
    public static List<Integer> listPrimes(int threshold) {
        List<Integer> list = new ArrayList<>();
        return list;
    }

    // TODO: Write tests for this
    public static List<Integer> listPrimes(int start, int threshold) {
        List<Integer> list = new ArrayList<>();
        return list;
    }

    // TODO: Write tests for this
    public static List<Integer> listPrimesMod(int n, int m) {
        List<Integer> list = new ArrayList<>();
        return list;
    }

    // TODO: Write tests for this
    public static int prime(int index) {
        return Integer.MIN_VALUE;
    }

    // TODO: Write tests for this
    public static int randomPrime(int bound) {
        return -1;
    }

    // TODO: Write tests for this
    public static int randomOddPrime(int bound) {
        return 0;
    }

    // TODO: Write tests for this
    public static int randomPrimeOtherThan(int p) {
        return p;
    }

    // TODO: Write tests for this
    public static int randomPrimeMod(int n, int m) {
        return 1;
    }

}

