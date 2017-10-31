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
    int i = 3; // i denotes the index of the current number, starts at 3 due to examining F3 first
    String places = "";

    // You need 3 variables for temporary storage while you iterate through the fib sequence
    BigInteger f1 = new BigInteger("1");
    BigInteger f2 = new BigInteger("1");
    BigInteger f3 = new BigInteger("2");

    while (places.length() < 1000) {
      // Calculate the next number in the fib sequence
      f1 = f2;
      f2 = f3;
      f3 = f1.add(f2); 

      i++;
      places = String.valueOf(f3); // Converts the int into a string for checking the number of characters
    }
    System.out.println("Index: " + i); // Prints the answer
  }
}
