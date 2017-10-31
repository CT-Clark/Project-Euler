/*
The series, 1**1 + 2**2 + 3**3 + ... + 10**10 = 10405071317.

Find the last ten digits of the series, 1**1 + 2**2 + 3**3 + ... + 1000**1000.
*/

import java.util.*;
import java.math.*;

public class Q48 {
  public static void main(String[] args) {
    BigInteger sum = new BigInteger("0");
    BigInteger product = new BigInteger("0");
    BigInteger temp = new BigInteger("1");

    // Loops until 1000*1000
    for (long i = 1; i <= 10000; i++) {
      String iString = Long.toString(i);
      System.out.println("(i): " + iString);

      product = new BigInteger(iString);
      temp = new BigInteger(iString);

      // Multiply i, i times (i**i)
      for (long j = 1; j < i; j++) {
        product = product.multiply(temp);
      }

      // Add result of self power to a sum
      sum = sum.add(product);
      //System.out.println(sum.toString());
    }

    System.out.println(sum.toString());
  }
}
