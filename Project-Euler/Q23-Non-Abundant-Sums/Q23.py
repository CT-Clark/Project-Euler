# A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
# For example, the sum of the proper divisors of 28
# would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
#
# A number n is called deficient if the sum of its proper divisors
# is less than n and it is called abundant if this sum exceeds n.
#
# As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
# the smallest number that can be written as the sum of two abundant numbers is 24.
# By mathematical analysis, it can be shown that all integers greater than 28123
# can be written as the sum of two abundant numbers.
# However, this upper limit cannot be reduced any further by analysis even though it is known
# that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
#
# Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

# 28124
import time
import math

startTime = time.clock()

totalList = []
abundantList = []
totalSum = 0

for i in range(1, 28124): # Makes a list of all of the numbers we're checking
    totalList.append(i)

for i in range(1, 28124): # Will determine which numbers are abundant
    print("Current number: ", i)
    sum = 0
    for n in range(1, int(i/2 + 1)):
        if i % n == 0:
            sum += n

    if sum > i:
        abundantList.append(i)
        print("Abundant Number:", i)

for valueOne in abundantList:
    tempSum = 0

    for valueTwo in abundantList[abundantList.index(valueOne):]:
        tempSum = valueOne + valueTwo
        if tempSum > 28124:
            print("--------BREAKING-----------")
            break
        if tempSum in totalList:
            totalList.remove(tempSum)
            print("Removed", tempSum, "from totalList. --- On number:", valueOne, "in abundantList.")

for value in totalList:
    totalSum += value

print("Answer: ", totalSum)
print("List of non-abundant sum numbers:", totalList)

print("\nRuntime:", (time.clock() - startTime) * 1000, "ms")
