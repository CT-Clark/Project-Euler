/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

import java.util.*;

public class Q7 {
  public static void main(String[] args) {

    // Initialize values
    boolean found = false;
    long maxPrime = 2; // Already found prime 1 (2)
    int count = 3;
    long i = 3;
    int numToFind = 10001;

    System.out.println("Prime 1: 2");
    System.out.println("Prime 2: 3");

    // Loops until max prime has been found
    while (found == false) {

      // Checks whether the number is prime
      for (int j = 2; j <= (int)Math.sqrt(i); j++) {
        if (i % j == 0) {
          break;
        } else if (j == (int)Math.sqrt(i)) {
          maxPrime = i;
          // System.out.println("Prime " + count + ": " + maxPrime); // Activate to see each prime
          count++;
        }

      }

      // Prints out the max prime and ends the program
      if (count == numToFind + 1) {
        System.out.println("\nMax Prime: " + maxPrime);
        found = true;
      }

      i += 2;
    }
  }
}
