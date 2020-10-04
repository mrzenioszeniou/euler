package euler;

/* 
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
public class Problem9 {
  public static void solve(int n) {
    for (int a=1;a<=n-2;a++) {
      for (int b=a+1;b<=n-1;b++) {
        int c = n - a - b;
        if (c*c == a*a + b*b) {
          System.out.println("Problem 9: "+a+"*"+b+"*"+c+"="+a*b*c);
          return;
        }
      }
    }
    throw new Error("Couldn't find a Pythagorean triplet a+b+c="+n);
  }
}