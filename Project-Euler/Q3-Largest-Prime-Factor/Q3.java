/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600 851 475 143 ?
*/

import java.lang.*;

public class Q3 {
  public static void main(String[] args) {
    long lNum = 600851475143L;
    long lPrime = 0L;

    for (long i = 3L; i < (long)Math.sqrt(lNum); i += 2) {

      // If i is a factor, examine it
      if ((lNum % i) == 0) {

        // Check if i is prime
        for (long j = 2L; j <= (long)Math.sqrt(i); j++) {
          if ((i % j) == 0) { // If i is -not- prime
            break;
          } else if (((i % j) != 0) && ( j == (long)Math.sqrt(i))) { // If i -is- prime
            if (i > lPrime) {
              lPrime = i; // Change max prime if needed
              System.out.println("Largest Prime Factor So Far: " + lPrime);
            }
          }
        }
      }
    }
    System.out.println("Largest Prime Factor Found: " + lPrime);
  }
}
