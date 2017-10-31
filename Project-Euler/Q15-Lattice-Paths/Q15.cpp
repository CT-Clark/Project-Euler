/*
Starting in the top left corner of a 2×2 grid,
and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
*/

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

int main() {



  uint64_t numerator = 20;
  uint16_t count = 0;
  uint64_t divisor = 1;
  uint64_t paths = 0;

  for (count = 1; count <= 20; count++) {
    divisor = divisor * count;
    cout << "Divisor: " << divisor << "\n";
  }

  for (count = 21; count <= 40; count++) {
    numerator = numerator * count;
    cout << "Numerator: " << numerator << "\n";
  }

  cout << "Numerator: " << numerator << " Denominator: " << divisor << "\n";

  paths = numerator / divisor;

  cout << paths << "\n";

  return 0;
}
