package euler;

import common.Sequences;

/* 
  The following iterative sequence is defined for the set of positive integers:

  n → n/2 (n is even)
  n → 3n + 1 (n is odd)

  Using the rule above and starting with 13, we generate the following sequence:

  13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
  It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

  Which starting number, under one million, produces the longest chain?

  NOTE: Once the chain starts the terms are allowed to go above one million.
*/
public class Problem14 {

  public static void solve(int limit) {
    int maxLen = 0;
    int maxLenNum = -1;
    for (int i=1;i<limit;i++) {
      int len = Sequences.collatz(i).size();
      if (len > maxLen) {
        maxLen = len;
        maxLenNum = i;
      }
    }
    System.out.println("Problem 14: " + maxLenNum);
  }

}