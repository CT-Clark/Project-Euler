# 2520 is the smallest number that can be
# divided by each of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is
# evenly divisible by all of the numbers from 1 to 20?

import time
import math

start_time = time.clock()

def main():
    i = 20
    count = 0

    while count != 20:
        count = 0
        j = 1
        while j <= 20:
            if i % j == 0 and i != 0:
                count += 1

            if count == 20:
                print("Smallest evenly divisible number:", i)

            j += 1
        i += 20

main()

print("\nRuntime:", (time.clock() - start_time) * 1000, "ms")
