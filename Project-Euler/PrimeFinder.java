/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

import java.util.*;

public class PrimeFinder {
  public static void main(String[] args) {

    // Initialize values
    boolean found = false;
    long maxPrime = 2; // Already found prime 1 (2)
    int count = 2;
    long i = 3;

    // Asks the user for the prime they want to find
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the prime you want to find: ");
    int primeNum = keyboard.nextInt();

    System.out.println("Prime 1: 2");

    // Loops until max prime has been found
    while (found == false) {
      boolean factor = false;

      // Checks whether the number is prime
      for (int j = 2; j < (i/4); j++) {
        if (i % j == 0) {
          factor = true;
        } else if ((factor == false) && (j == (i-1))) {
          maxPrime = i;
          System.out.println("Prime " + count + ": " + maxPrime);
          count++;
        }

      }

      // Prints out the max prime and ends the program
      if (count == primeNum + 1) {
        System.out.println("\nMax Prime: " + maxPrime);
        found = true;
      }

      i++;
    }
  }
}
