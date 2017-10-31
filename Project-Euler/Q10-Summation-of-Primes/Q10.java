/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

public class Q10 {
  public static void main(String[] args) {

    // Initialize variables
    boolean found = false;
    int count = 2;
    long i = 5;
    long sum = 5;

    // Loops until max prime has been found
    while (i < 2000000) {

      // Checks whether the number is prime
      // Then compares it
      for (int j = 2; j <= (int)Math.sqrt(i); j++) {
        if (i % j == 0) {
          break;
        } else if (j == (int)Math.sqrt(i)) {
          //maxPrime = i;
          sum += i;
          count++;
        }
      }
      i++;
    }
    System.out.println("Sum: " + sum);
  }
}
