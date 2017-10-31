/*

If the numbers 1 to 5 are written out in words:
one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens.
For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
The use of "and" when writing out numbers is in compliance with British usage.

Answer = 21124
*/

import java.util.*;
import java.math.*;

public class Q17 {
  public static void main(String[] args) {
    int sum = 1060; // For all of the numbers where the last 2 digits are 1-19

    for (int i = 1; i <= 1000; i++) {
      if ((i >= 100) && (i < 300) || (i >= 600) && (i < 700)) {
        sum += 13; // xxxhundredand---
        sum += underOneHundred(i);
        if (i % 100 == 0) {
          sum -= 3;
        }
      } else if ((i >= 400) && (i < 600) || (i <= 900) & (i < 1000)) {
        sum += 14; // xxxxhundredand
        sum += underOneHundred(i);
        if (i % 100 == 0) {
          sum -= 3;
        }
      } else if ((i >= 300) && (i < 400) || (i >= 700) && (i < 900)) {
        sum += 15; // xxxxxhundredand---
        sum += underOneHundred(i);
        if (i % 100 == 0) {
          sum -= 3;
        }
      } else if (i == 1000) {
        sum += 11; // onethousand
      } else {
        sum += underOneHundred(i);
      }
    }

    System.out.println(sum);
  }

  private static int underOneHundred(int i) {
    int addition = 0;
    i = i % 100;
    if ((i >= 40) && (i < 70)) {
      addition = 5;
      addition += underTen(i);
    } else if ((i >= 20) && (i < 40) || (i >= 80) && (i <= 99)) {
      addition = 6;
      addition += underTen(i);
    } else if ((i >= 70) && (i < 80)) {
      addition = 7;
      addition += underTen(i);
    }
    return addition;
  }

  public static int underTen(int i) {
    int addition = 0;
    i = i % 10;
    if (i == 1 || i == 2 || i == 6) {
      addition = 3;
    } else if (i == 4 || i == 5 || i == 9) {
      addition = 4;
    } else if (i == 7 || i == 8 || i == 3) {
      addition = 5;
    }
    return addition;
  }
}
