package euler;

import java.math.BigInteger;

import common.Sequences;
import common.Utilities;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * 
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 * 
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 * 
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem25 {

    public static void solve() {
      
      BigInteger a = BigInteger.ONE;
      BigInteger b = BigInteger.ONE;
      long idx = 2;
      

      while (Utilities.countDigits(b) < 1000) {
        final BigInteger tmp = b;
        b = b.add(a);
        a = tmp;
        idx += 1;
      }

      System.out.println("Problem 25: F_"+ idx+" ("+b+")");

    }
    
}
