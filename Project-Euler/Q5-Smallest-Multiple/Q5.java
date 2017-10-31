/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Q5 {
  public static void main(String[] args) {
    long finalNumber = 0L;
    long i = 0L;
    boolean found = false;
    int count = 0;

    while (count != 20) {
      count = 0; // Resets every cycle

      // If i contains any number from 1-20 as a factor, increase the count
      for (int j = 1; j <= 20; j++) {
        if (((i % j) == 0) && (i != 0)) {
          count++;
        }

        // Prints i if i is evenly divisible by (1-20)
        if (count == 20) {
          System.out.println("Smallest evenly divisible number: " + i);
        }
      }
    i += 20; // No need to check any number where 20 cannot divide i
    }
  }
}
