/*
The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330,
is unusual in two ways: (i) each of the three terms are prime, and,
                        (ii) each of the 4-digit numbers are permutations of one another.

There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property,
but there is one other 4-digit increasing sequence.

What 12-digit number do you form by concatenating the three terms in this sequence?
*/

import java.util.*;
import java.math.*;

public class Q49 {
  private static void log(Object o) {
    System.out.println(o);
  }

  public static void main(String[] args) {

    ArrayList<Integer> primes = new ArrayList<Integer>();
    ArrayList<Integer> listOfNums = new ArrayList<Integer>();

    // Creates the list of prime numbers //
    for (int i = 1001; i < 10000; i += 2) {
      for (int j = 2; j <= (int)Math.sqrt(i); j++) {
        if (i % j == 0) /*============*/ { break; }
        else if (j == (int)Math.sqrt(i)) { primes.add(i); }
      }
    }

    String tempString = "";
    for (int currentPrime1 : primes) {
      listOfNums.clear();
      listOfNums.add(currentPrime1);

      String primeString = Integer.toString(currentPrime1); // 1234
      for (int i = 1000; i < 10000; i++) {
        int count = 0;
        tempString = Integer.toString(i);
        for (int j = 0; j < 4; j++) {
          if (primeString.contains(tempString.substring(j, j+1))) {
            count++;
            primeString = primeString.replace(tempString.substring(j, j+1), "");
          }

          if ((count == 4) && primes.contains(i)) {
            listOfNums.add(i);
          }
        }
      }

      Collections.sort(listOfNums); // Sorts the listOfNums from lowest to highest

      log(listOfNums);
    }
  }
}
