package euler;

import common.Utilities;

/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/
public class Problem21 {

  public static void solve(long n) {
    long sum = 0;
    for (long i=1;i<n;i++) {
      long d_i = Utilities.divisors(i).stream().mapToLong(x->x).sum();
      long d_d_i = Utilities.divisors(d_i).stream().mapToLong(x->x).sum();
      if (d_d_i == i && i != d_i) {
        sum += i;
      }
    }
    System.out.println("Problem 21: "+sum);
  }

}