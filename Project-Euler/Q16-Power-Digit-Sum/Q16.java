/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2**1000?
*/

import java.util.*;
import java.math.*;

public class Q16 {
  public static void main(String[] args) {
    int i = 1;
    long sum = 0;

    BigInteger f1 = new BigInteger("2");
    BigInteger f2 = new BigInteger("2");

    for (i = 2; i <= 1000; i++) {
      f1 = f1.multiply(f2);
    }

    String largeNumber = f1.toString();

    for (i = 0; i < largeNumber.length(); i++) {
      sum += Long.parseLong(largeNumber.substring(i,i+1));
    }

    System.out.println("2^1000 = " + f1);
    System.out.println("\n" + sum + " is the sum of all of the digits.");
  }
}
