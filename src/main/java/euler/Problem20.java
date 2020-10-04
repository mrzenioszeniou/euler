package euler;
import java.math.BigInteger;

/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/
public class Problem20 {

  public static void solve(int n) {
    BigInteger factorial = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
    BigInteger i = BigInteger.valueOf(n);
    while (i.compareTo(BigInteger.ZERO) != 0) {
      factorial = factorial.multiply(i);
      i = i.subtract(BigInteger.ONE);
    }
    while (factorial.compareTo(BigInteger.ZERO) > 0) {
      sum = sum.add(factorial.mod(BigInteger.TEN));
      factorial = factorial.divide(BigInteger.TEN);
    }

    System.out.println("Problem 20: "+sum);
  }

}