package euler;

import java.util.stream.IntStream;

/* 
  The sum of the squares of the first ten natural numbers is,

  1^2 + 2^2 + ... + 10^2 = 385
  The square of the sum of the first ten natural numbers is,

  (1 + 2 + ... + 10)^2 = 552 = 3025
  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Problem6 {
  public static void solve(int n) {
    final int sum = IntStream.range(1, n+1).sum();
    int ret = 0;
    int cur = 0;
    for (int i=1;i<=n;i++) {
      cur += i;
      ret += 2 * i * (sum - cur);
    }
    System.out.println("Problem 6: "+ret);
  }
}