package euler;

import java.util.ArrayList;
import java.util.Arrays;

import common.Primes;
import common.Utilities;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {

  public static void solve(int n) {
      ArrayList<Integer> ledger = new ArrayList<>(Arrays.asList(1));
      for (int i=1;i<=n;i+=1) {
        ledger.addAll(Utilities.missing(ledger, Primes.primeFactorization(i)));
      }

      int product = ledger.stream().reduce(1,(x,y) -> x*y);
      System.out.println("Problem 5: "+product);
  }

}
