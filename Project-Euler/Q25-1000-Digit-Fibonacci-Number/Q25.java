/*
The Fibonacci sequence is defined by the recurrence relation:

    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

Hence the first 12 terms will be:

    F1 = 1
    F2 = 1
    F3 = 2
    F4 = 3
    F5 = 5
    F6 = 8
    F7 = 13
    F8 = 21
    F9 = 34
    F10 = 55
    F11 = 89
    F12 = 144

The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
*/

import java.util.*;
import java.math.*;

public class Q25
{
  public static void main(String[] args)
  {
    int i = 3;

    BigInteger f1 = new BigInteger("1");
    BigInteger f2 = new BigInteger("1");
    BigInteger f3 = new BigInteger("2");

    BigInteger f1000 = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");

    //while (f3.compareTo(f1000) == -1) {
    while (true) {


      f1 = f2;
      f2 = f3;
      f3 = f1.add(f2);

      i++;
      String places = String.valueOf(f3);
      System.out.println("Value of f3: " + f3);
      System.out.println("Number of digits: " + places.length());
      System.out.println("Index: " + i);
    //}
    }
  }
}
