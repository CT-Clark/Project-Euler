/*

Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
Triangle 	  	Tn=n(n+1)/2 	  	1, 3, 6, 10, 15, ...
Pentagonal 	  	Pn=n(3n−1)/2 	  	1, 5, 12, 22, 35, ...
Hexagonal 	  	Hn=n(2n−1) 	  	1, 6, 15, 28, 45, ...

It can be verified that T285 = P165 = H143 = 40755.

Find the next triangle number that is also pentagonal and hexagonal.
*/

import java.util.*;
import java.math.*;

public class Q45 {
  public static void main(String[] args) {
    System.out.println("\n===================( START OF PROGRAM )===================\n");

    long tInc, pInc, hInc;
    tInc = pInc = hInc = 1;
    long inc = 286;
    long limit = 2;
    // Establishes upper limit to search
    for (int i = 1; i < 35; i++) {
      limit *= 2;
    }

    ArrayList<Long> triangleNumbers = new ArrayList<Long>();
    ArrayList<Long> pentagonalNumbers = new ArrayList<Long>();
    ArrayList<Long> hexagonalNumbers = new ArrayList<Long>();

    // Creates the array of triangular numbers
    for (long i = 1; i < limit; i += tInc) {
      triangleNumbers.add(i);
      tInc += 1;
    }

    // Creates the array of pentagonal numbers
    for (long i = 1; i < limit; i += pInc) {
      pentagonalNumbers.add(i);
      pInc += 3;
    }

    // Creates the array of hexagonal numbers
    for (long i = 1; i < limit; i += hInc) {
      hexagonalNumbers.add(i);
      hInc += 4;
    }

    // Checks through every triangular number until the goal is accomlished
    for (long i = 41041; i < limit; i += inc) {
      if (triangleNumbers.contains(i) && pentagonalNumbers.contains(i) && hexagonalNumbers.contains(i)) {
        System.out.println("   Final Number: " + i);
        break;
      }
      inc += 1;
    }
    System.out.println("\n====================( END OF PROGRAM )====================\n");
  }
}
