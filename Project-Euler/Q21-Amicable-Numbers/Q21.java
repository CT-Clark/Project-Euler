/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/

import java.util.*;
import java.math.*;

public class Q21 {
  public static void main(String[] args) {
    ArrayList<Integer> amicableNumbers = new ArrayList<Integer>();
    ArrayList<Integer> firstFactors = new ArrayList<Integer>();
    ArrayList<Integer> secondFactors = new ArrayList<Integer>();
    int totalSum = 0;

    for (int i = 1; i <= 10000; i++) {
      firstFactors.clear();
      long firstFactorsSum = 0;
      for (int j = 1; j <= i/2; j++) {
        if (i % j == 0) {
          firstFactors.add(j);
        }
      }

      for (int m = 0; m < firstFactors.size(); m++) {
        firstFactorsSum += firstFactors.get(m);
      }

        // Finds the factors and sum of factors for second number
        for (int k = 1; k <= 10000; k++) {
          secondFactors.clear();
          long secondFactorsSum = 0;
          for (int l = 1; l <= k/2; l++) {
            if (k % l == 0) {
              secondFactors.add(l);
            }
          }

          for (int n = 0; n < secondFactors.size(); n++) {
            secondFactorsSum += secondFactors.get(n);
          }

          if ((firstFactorsSum == k) && (secondFactorsSum == i) && (k != i)) {
            if (amicableNumbers.contains(i) == false) {
              amicableNumbers.add(i);
            }
            if (amicableNumbers.contains(k) == false) {
              amicableNumbers.add(k);
            }
          }
        }

      System.out.println("(i): " + i + " FFS: " + firstFactorsSum);
      System.out.println(firstFactors);
      System.out.println("Amicable Numbers: " + amicableNumbers);
    }

    for (int z = 0; z < amicableNumbers.size(); z++) {
      totalSum += amicableNumbers.get(z);
    }

    System.out.println(totalSum);
  }
}
