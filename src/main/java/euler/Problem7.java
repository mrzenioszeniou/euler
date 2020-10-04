package euler;

import common.Primes;
/* 
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    What is the 10 001st prime number?
*/
public class Problem7 {
  public static void solve(int n) {
    int cnt = 1;
    for (int i=3;;i+=2) {
      if (Primes.isPrime(i) && ++cnt == n) {
        System.out.println("Problem 7: "+i);
        return;
      }
    }
  }
}