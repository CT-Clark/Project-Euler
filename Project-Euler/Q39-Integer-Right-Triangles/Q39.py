# If p is the perimeter of a right angle triangle with integral length sides,
# {a,b,c}, there are exactly three solutions for p = 120.
#
# {20,48,52}, {24,45,51}, {30,40,50}
#
# For which value of p ≤ 1000, is the number of solutions maximised?

import time
import math

startTime = time.clock()

largestp = 2
largestCount = 0

for p in range(2, 1001):
    count = 0
    a = 1
    b = 1
    c = p - (a + b)

    if c >= p / 3:

        while a <= c:
            b = 0 + a
            c = p - (a + b)

            while b <= c:

                if a + b + c == p and a**2 + b**2 == c**2:
                    count += 1

                    if count > largestCount:
                        largestCount = count
                        largestp = p

                c -= 1
                b += 1

            c -= 1
            a += 1

print("The answer is", largestp, "with", largestCount, "sets.")
print("\nRuntime:", (time.clock() - startTime) * 1000, "ms")
