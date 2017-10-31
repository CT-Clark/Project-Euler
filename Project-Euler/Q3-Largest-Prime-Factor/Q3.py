# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600 851 475 143 ?

import time
import math

start_time = time.clock()

MAX_NUM = 600851475143
largest_prime, i = 2, 3

while i <= int(math.sqrt(MAX_NUM)):
    #print("i:", i)
    if MAX_NUM % i == 0:
        j = 2
        while j <= int(math.sqrt(i)):
            if i % j == 0:
                break
            elif i % j != 0 and j == int(math.sqrt(i)):
                if i > largest_prime:
                    largest_prime = i
            j += 1
    i += 2

print("Largest Prime:", largest_prime)
print("\nRuntime:", (time.clock() - start_time) * 1000, "ms")
