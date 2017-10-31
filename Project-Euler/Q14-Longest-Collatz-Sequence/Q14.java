/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem),
it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

note: Once the chain starts the terms are allowed to go above one million.
*/

import java.util.*;

public class Q14
{
  public static void main(String[] args)
  {
    long count = 0;
    long maxChain = 0;
    long maxChainNum = 0;

    for (long i = 1; i < 1000000; i++) {
      count = performAction(i);
      System.out.println("I: " + i + " which has " + count + " chains.");
      if (count > maxChain) {
        maxChain = count;
        maxChainNum = i;
      }
    }

    System.out.println(maxChainNum + " With " + maxChain + " chains.");
  }

  public static long performAction(long number) {
    long count = 0;

    if (number == 1) {
      count++;
      return count;
    } else if ((number % 2) == 0) {
      number /= 2;
      count++;
      count += performAction(number);
    } else {
      number = (3 * number) + 1;
      count++;
      count += performAction(number);
    }

    return count;
  }
}
