/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Q4 {
  public static void main(String[] args) {
    int finalNumber = 0;

    // Loops through all pairs of 3 digit numbers
    for (int i = 100; i < 999; i++) {
      for (int j = 100; j < 999; j++) {

        int product = i * j;
        int count = 0;
        String productString = Integer.toString(product);

        for (int k = 0; k < productString.length(); k++) {
          // Compares the numbers from alternating sides (twice)
          if (productString.charAt(k) == productString.charAt(productString.length() - (1 + k))) {
            count++;
          }

          // If all sets of the numbers have been confirmed palindromes, compare it to last palindrome
          // If it's larger, replace it and print it.
          if (count == (productString.length())) {
            if (product > finalNumber) {
              finalNumber = product;
            }
          }
        }
      }
    }
    System.out.println("Largest palindrome of the product of two 3 digit numbers: " + Integer.toString(finalNumber));
  }
}
