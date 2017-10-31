# A palindromic number reads the same both ways.
# The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.

import time
import math

start_time = time.clock()

final_number = 0

i = 100
while i < 1000:
    j = 100
    while j < 1000:
        product = i * j
        count = 0
        product_string = str(product)

        k = 0
        while k < len(product_string):
            if product_string[k] == product_string[len(product_string) - (1 + k)]:
                count += 1

            if count == len(product_string):
                if product > final_number:
                    final_number = product

            k += 1
        j += 1
    i += 1
print("Largest palindrome of the product of two 3 digit numbers:", final_number)
print("\nRuntime:", (time.clock() - start_time) * 1000, "ms")
