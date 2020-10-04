package euler;

import java.math.BigInteger;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
  private static BigInteger zero = new BigInteger("0");
  private static BigInteger two = new BigInteger("2");

  public static void solve(String num) {
    BigInteger max = new BigInteger("1");
    BigInteger n = new BigInteger(num);
    BigInteger sqRoot = n.sqrt();


    while (n.mod(two).compareTo(two) == 0) {
      n.divide(two);
      max = two;
    }

    for (BigInteger i = new BigInteger("3");i.compareTo(sqRoot)<0;i=i.add(two)) {
      while (n.mod(i).compareTo(zero) == 0) {
        n = n.divide(i);
        max = i;
      }
    }

    System.out.println("Problem 3: "+max);
  }
}
