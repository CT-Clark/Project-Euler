/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

int main()
{
  cout << "Program Starting\n";

  char found = 0;
  uint32_t maxPrime = 2; // Already found prime 1 (2)
  uint32_t count = 4;
  uint32_t i = 7; // Start at 7
  uint64_t sum = 10; // Include 2 + 3 + 5
  //char buffer1 [1000];
  //char buffer2 [1000];

  cout << "Prime 1: 2\n";

  // Loops until max prime has been found
  while (found == 0) {
    char factor = 0;

    // Checks whether the number is prime
    for (int j = 2; j <= (i/2); j++) {
      if (i % j == 0) {
        factor = 1;
      } else if ((factor == 0) && (j == ((i/2)-1))) {
        maxPrime = i;
        sum += maxPrime;
        cout << "\nPrime " << count << ": " << maxPrime;
        cout << "\nSum: " << sum;
        count++;
      }

    }

    // Prints out the max prime and ends the program
    if (maxPrime >= 2000000) {
      cout << "\nMax Prime: " << maxPrime << "\n";
      cout << "\nLook at the second last sum";
      found = 1;
    }

    i += 2;
  }

  return 0;
}
