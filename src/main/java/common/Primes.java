package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 *  Some primal shit going on here.
 */
public class Primes {

  /**
   * Breaks down an integer into its prime factors.
   * @param n The number to break down.
   * @return {@link ArrayList} containing all the factors.
   */
  public static ArrayList<Integer> primeFactorization(int n) {
    ArrayList<Integer> ret = new ArrayList<>();
    while (n % 2 == 0) {
      ret.add(2);
      n /= 2;
    }
    for (int i=3;i<=n;i+=2) {
      while (n % i == 0) {
        ret.add(i);
        n /= i;
      }
    }
    return ret;
  }

  /**
   * Checks the primality of an integer.
   * @param n - Number to check.
   * @return Returns `true` if the provided number is a prime, `false` otherwise.
   */
  public static boolean isPrime(int n) {
    int lim = (int) Math.ceil(Math.sqrt((double) n));
    if (n % 2 == 0) {
      return false;
    }
    for (int i=3;i<=lim;i+=2) {
      if (n % i == 0) {
        return false;
      } 
    }
    return true;
  }

  // Sieve of Eratosthenes. Finds all prime numbers up to and including the provided number.
  public static HashSet<Integer> sieveOfEratosthenes(int n) {

    HashSet<Integer> ret = new HashSet<>(IntStream.range(2, n+1).boxed().collect(Collectors.toSet()));
    int root = (int) Math.sqrt(n);
    for (int i=2;i<=root;i++) {
      for (int j=2*i;j<=n;j+=i) {
        ret.remove(j);
      }
    }
    return ret;
  }

}