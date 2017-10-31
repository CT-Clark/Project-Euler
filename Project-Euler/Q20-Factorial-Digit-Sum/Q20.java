/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.util.*;
import java.math.*;

public class Q20 {
  public static void main(String[] args) {
    BigInteger sum = new BigInteger("100");
    BigInteger subtract = new BigInteger("1");
    BigInteger count = new BigInteger("100");
    int finalSum = 0;

    for (count = new BigInteger("100"); count.intValue() >= 1; count = new BigInteger(count.subtract(subtract).toString())) {
      sum = sum.multiply(count);
      System.out.println(count);
    }

    String summation = sum.toString();
    for (int i = 0; i < summation.length(); i++) {
      finalSum += Integer.parseInt(summation.substring(i, i+1));
    }

    System.out.println(finalSum);
  }
}
