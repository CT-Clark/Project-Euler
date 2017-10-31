# The sum of the squares of the first ten natural numbers is,
# 1**2 + 2**2 + ... + 10**2 = 385
#
# The square of the sum of the first ten natural numbers is,
# (1 + 2 + ... + 10)**2 = 55**2 = 3025
#
# Hence the difference between the sum of the squares of the first ten natural numbers
# and the square of the sum is 3025 − 385 = 2640.
#
# Find the difference between the sum of the squares of the
# first one hundred natural numbers and the square of the sum.

import math
import time
start_time = time.clock()

def main():
    sum = 0
    square = 0
    difference = 0
    sum_of_ten = 0
    i = 1
    j = 1

    # Looks at the su of the squares
    while i <= 100:
        sum += i ** 2
        i += 1
    # Looks at th sum of the numbers
    while j <= 100:
        sum_of_ten += j
        j += 1

    # Examines the square of the sum,
    # and the difference of the square and the sum
    square = sum_of_ten ** 2
    difference = square - sum
    print("sum:", sum)
    print("Square:", square)
    print("Difference:", difference)

main()

print("\nRuntime:", (time.clock() - start_time) * 1000, "ms")
