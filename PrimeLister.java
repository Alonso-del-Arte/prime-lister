/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primelister;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alonso del Arte
 */
public class PrimeLister {
    
    public static final int DEFAULT_THRESHOLD = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int threshold, halfThreshold;
        if (args.length > 0) {
            try {
                threshold = Integer.parseInt(args[0]);
            } catch (NumberFormatException nfe) {
                threshold = DEFAULT_THRESHOLD;
            }
        } else {
            threshold = DEFAULT_THRESHOLD;
        }
        if (threshold < 0) {
            threshold *= -1;
        }
        if (threshold % 2 == 1) {
            halfThreshold = (threshold + 1)/2;
        } else {
            halfThreshold = threshold/2;
        }
        List<Integer> oddPrimes = new ArrayList<>();
        boolean[] primeFlags = new boolean[halfThreshold];
        for (int j = 0; j < halfThreshold; j++) {
            primeFlags[j] = true;
        }
        int currPrime = 3;
        int twiceCurrPrime, currIndex;
        while (currPrime < threshold) {
            oddPrimes.add(currPrime);
            twiceCurrPrime = 2 * currPrime;
            for (int m = currPrime * currPrime; m < threshold; m += twiceCurrPrime) {
                currIndex = (m - 3)/2;
                primeFlags[currIndex] = false;
            }
            do {
                currPrime += 2;
                currIndex = (currPrime - 3)/2;
            } while (currIndex < (halfThreshold - 1) && primeFlags[currIndex] == false);
        }
        System.out.print("Primes up to " + threshold + " are: 2");
        for (int i = 0; i < oddPrimes.size(); i++) {
            System.out.print(", " + oddPrimes.get(i));
        }
        System.out.println(".");
    }
    
}
