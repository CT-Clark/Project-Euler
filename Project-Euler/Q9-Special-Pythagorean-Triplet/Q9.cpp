/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a**2 + b**2 = c**2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

int main()
{
  int a = 1;
  int b = 2;
  int c = 3;
  char found = 0;

  for (a = 0; a < 500; a++) {
    for (b = 0; b < 500; b++) {
      for (c = 0; c < 1000; c++) {
        if ((a*a + b*b == c*c) && (a + b + c == 1000) && ((a < b) && (b < c))) {
          cout << "\n========== a: " << a << " b: " << b << " c: " << c << " ==========";
          cout << "\n==========   a*b*c = " << a*b*c << "   ==========\n";
        }
      }
    }
  }

  cout << "\n";
  return 0;
}
