package euler;

import java.math.BigInteger;

/* 
  2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

  What is the sum of the digits of the number 2^1000?
*/
public class Problem16 {

  public static void solve(int n) {
    BigInteger num = BigInteger.TWO.pow(n);
    BigInteger sum = BigInteger.ZERO;

    while (num.compareTo(BigInteger.ZERO) > 0) {
      sum = sum.add(num.mod(BigInteger.TEN));
      num = num.divide(BigInteger.TEN);
    }

    System.out.println("Problem 16: " + sum);
  }

}