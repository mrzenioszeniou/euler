package euler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

  public static void solve(int digits) {
    int min = (int) Math.pow(10, digits - 1);
    int max = (int) Math.pow(10, digits);
    int ret = 0;
    for (int i=min;i<max;i++) {
      for (int j=i;j<max;j++) {
        int prod = i*j;
        if (prod > ret && isPalindrome(""+prod)) {
          ret = prod;
        }
      }
    }

    System.out.println("Problem 4: "+ret);
  }

  private static boolean isPalindrome(String str) {
    int n = str.length();
    if (n % 2 != 0) {
      return false;
    }

    for (int i=0;i<n/2;i++){
      if (str.charAt(i) != str.charAt(n-1-i)) {
        return false;
      }
    }

    return true;
  }
}
