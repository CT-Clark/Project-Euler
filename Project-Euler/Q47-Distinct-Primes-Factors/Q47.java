/*
The first two consecutive numbers to have two distinct prime factors are:

14 = 2 × 7
15 = 3 × 5

The first three consecutive numbers to have three distinct prime factors are:

644 = 2² × 7 × 23
645 = 3 × 5 × 43
646 = 2 × 17 × 19.

Find the first four consecutive integers to have four distinct prime factors each. What is the first of these numbers?
*/

import java.util.*;
import java.math.*;

public class Q47 {
  public static void main(String[] args) {
    System.out.println("\n===================( START OF PROGRAM )===================\n");

    // INITIAL VALUES
    boolean numbersFound = false;
    ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();
    int count = 0;
    int factor1, factor2, factor3, factor4 = 1;
    int i = 644; int j = 645; int k = 646; int l = 647;
    int m, n, o, p;

    // Adds 2 and 3 to the list of prime numbers
    listOfPrimes.add(2);
    listOfPrimes.add(3);

    // Compiles a list of fprime numbers from 5 -> 10 000
    for (m = 5; m < 10000; m += 2) {
      boolean factorFound = false;
      for (n = 2; n < m; n++) {
        if (factorFound == false) {
          if (m % n == 0) {
            factorFound = true;
          } else if ((factorFound == false) && (n == m - 1)) {
            listOfPrimes.add(m);
          }
        }
      }
    }

    // Checks all of the factors of our quartet of numbers
    while (numbersFound == false) {
      count = 0;

      outerloop:
      // Checks first number for prime factors
      for (m = 0; m < listOfPrimes.size(); m++) {
        if (i % listOfPrimes.get(m) == 0) {
          count++;
        }

        // Runs if first number has 4 prime factors
        if (count == 4) {
          count = 0;
          for (n = 0; n < listOfPrimes.size(); n++) {
            if (j % listOfPrimes.get(n) == 0) {
              count++;
            }

            // Runs if second number has 4 prime factors
            if (count == 4) {
              count = 0;
              for (o = 0; o < listOfPrimes.size(); o++) {
                if (k % listOfPrimes.get(o) == 0) {
                  count++;
                }

                // Runs if third number has 4 prime factors
                if (count == 4) {
                  count = 0;
                  for (p = 0; p < listOfPrimes.size(); p++) {
                    if (l % listOfPrimes.get(p) == 0) {
                      count++;
                    }

                    // Runs if fourth number has 4 prime factors
                    if (count == 4) {
                      System.out.println("(i): "+i+" (j): "+j+" (k): "+k+" (l): "+l);
                      numbersFound = true;
                      break outerloop; // Breaks out of all the loops
                    }
                  }
                }
              }
            }
          }
        }
      }
      i++; j++; k++; l++; // Checks the next set of 4 consecutive digits
    }

    System.out.println("\n====================( END OF PROGRAM )====================\n");
  }
}
