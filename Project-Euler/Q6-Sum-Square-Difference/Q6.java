/*
The sum of the squares of the first ten natural numbers is,
1**2 + 2**2 + ... + 10**2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)**2 = 55**2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class Q6
{
  public static void main(String[] args)
  {
    long sum = 0;
    long square = 0;
    long difference = 0;
    long sumOfTen = 0;

    // Looks at the sum of squares
    for (int i = 1; i <= 100; i++) {
      sum += i * i;
    }

    // Looks at the sum of the numbers
    for (int j = 1; j <= 100; j++) {
      sumOfTen += j;
    }

    // Examines the square of the sum, and the difference of the square and the sum
    square = sumOfTen * sumOfTen;
    difference = square - sum;

    System.out.println("Sum: " + sum);
    System.out.println("Square: " + square);
    System.out.println("Difference: " + difference);
  }
}
