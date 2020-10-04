package common;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

/**
 *  Bunch of utility functions to ease your pain.
 */
public class Utilities {
  /**
   * Returns an {@link ArrayList} of all the items included in b but not a. If an item is included
   * twice in "b" but only once in "a", it will be in the returned list.
   * @param a
   * @param b
   * @return
   */
  public static ArrayList<Integer> missing(final ArrayList<Integer> a, final ArrayList<Integer> b) {
    ArrayList<Integer> aCopy = new ArrayList<>(a);
    ArrayList<Integer> missing = new ArrayList<>();

    for (Integer i: b) {
      if (aCopy.contains(i)) {
        aCopy.remove(i);
      }else{
        missing.add(i);
      }
    }

    return missing;
  }

  
  /**
   * Returns the sum of a number's digits
   * @param n
   * @return
   */
  public static long digitSum(final long n) {
    long sum = 0;
    long num = n;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

  /**
   * Returns the factorial of the given number
   * @param n
   * @return
   */
  public static long factorial(final long n) {
    long factorial = 1;
    for (long num=n;num>0;num--) {
      factorial *= num;
    }
    return factorial;
  }

  /**
   * Returns all the proper divisors of the provided integer.
   * @param n
   * @return
   */
  public static Collection<Long> divisors(final long n) {
    ArrayList<Long> ret = new ArrayList<>();
    for (long i=1;i<n;i++) {
      if (n % i == 0) {
        ret.add(i);
      }
    }
    return ret;
  }

  /**
   * Returns true if the provided integers are an amicable pair
   */
  public static boolean amicable(final long x, final long y) {
    return divisors(x).stream().mapToLong(n->n).sum() == y
        && divisors(y).stream().mapToLong(n->n).sum() == x;
  }

  /**
   * Returns the number of decimal digits in the provided big integer
   */
  public static long countDigits(final BigInteger n) {
    long ret = 1;
    BigInteger number = n;
    final BigInteger ten = BigInteger.valueOf(10);

    while (number.compareTo(ten) >= 0) {
      number = number.divide(ten);
      ret += 1;
    }

    return ret;
  }

}