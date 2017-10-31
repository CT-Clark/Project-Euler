/*
The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13

This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
*/

import java.util.*;
import java.math.*;

public class Q50 {
  public static void main(String[] args) {

    ArrayList<Integer> primes = new ArrayList<Integer>();

    // Creates the list of prime numbers //
    primes.add(2);
    primes.add(3);

    for (int i = 5; i < 1000000; i += 2) {
      for (int j = 2; j <= (int)Math.sqrt(i); j++) {
        if (i % j == 0) /*============*/ { break; }
        else if (j == (int)Math.sqrt(i)) { primes.add(i); }
      }
    }

    //
    List<Integer> temp = new ArrayList<Integer>();
    int sum = 0, maxSum = 0, count = 0, maxCount = 0;

    /*
     * Iterates through the list of primes
     * First for loop iterates through the list of primes, which decides the starting index of the second loop
     * Second loop adds an increasing amount of indexes to the starting index to calculate the sum
     * Keeps a record of the highest count of consecutive indexes
     */

    int primeIndexResult = 0;
    for (int primeIndex = 0; primeIndex < primes.size(); primeIndex++) {
      for (int tempIndex = 1; tempIndex < primes.size() - primeIndex; tempIndex++) {
        sum = 0;
        temp = primes.subList(primeIndex, primeIndex + tempIndex);

        for (int i = 0; i < temp.size(); i++) { sum += temp.get(i); }

        if (sum > 1000000) { break; } // Not interested in any number if the sum is > 1000000

        if (primes.contains(sum)) { // If the sum is a prime, compare it to past entries
          count = temp.size();

          if (count > maxCount) { // If the sum is composed of the largest sequence to date, store it
            maxSum = sum;
            maxCount = count;
            primeIndexResult = primeIndex;
          }
        }
      }
      System.out.println(temp.get(0)); // Enabling lets you check to see which index you're starting on
    }

    System.out.println("maxCount: " + maxCount + " maxSum: " + maxSum);
    System.out.println("Prime Index Number: " + primeIndexResult);
    System.out.println(primes.subList(1, 545));
  }
}
