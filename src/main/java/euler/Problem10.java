package euler;

import java.util.HashSet;

import common.Primes;

/* 
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
public class Problem10 {
  public static void solve(int n) {
    long sum = 0;
    HashSet<Integer> primes = Primes.sieveOfEratosthenes(n);
    System.out.print("Found "+primes.size()+" primes.. ");
    for (Integer i: primes) {
      sum += i;
    }
    System.out.println("Problem 10: "+sum);
  }
}