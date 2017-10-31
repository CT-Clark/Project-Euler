/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/


#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

int main()
{
  cout << "Program starting...\n";

  char found = 0;
  long maxPrime = 2; // Already found prime 1 (2)
  int count = 2;
  long i = 3;
  int numToFind = 10001;
  long sum = 0;

  cout << "Prime 1: 2"; // First prime

  // Loops until max prime has been found
  while (found == 0) {
    char factor = 0;

    // Checks whether the number is prime
    for (int j = 2; j < i; j++) {
      if (i % j == 0) {
        factor = 1;
      } else if ((factor == 0) && (j == (i-1))) {
        maxPrime = i;
        sum += maxPrime;
        if (count % 1000 == 0) {
          cout << "\nPrime " << count << ": " << maxPrime << "\nSum: " << sum;
        }
        count++;
      }
    }

    // Prints out the max prime and ends the program
    if (count == numToFind + 1) {
      cout << "\nMax Prime: " << maxPrime << "\n";
      found = 1;
    }
    i++; // Checks next i
  }
  return 0;
}
