package euler;

/* 
  If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there
   are 3 + 3 + 5 + 4 + 4 = 19 letters used in total. If all the numbers from 1 to 1000 (one thousand)
    inclusive were written out in words, how many letters would be used?


  NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
  and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in 
  compliance with British usage.
*/
public class Problem17 {

  private static String[] digits = new String[]{
    "",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen",
  };

  private static String[] tenths = new String[]{
    "",
    "",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety"
  };

  private static String hundred = "hundred";
  private static String and = "and";

  public static void solve() {
    int sum = 0;
    for (int i=1;i<=1000;i++) {
      int cnt = countLetters(i);
      sum += cnt;
      // System.out.println(i+": "+cnt+" letters");
    }

    System.out.println("Problem 17: " + sum);
  }

  private static int countLetters(int n) {
    int count = 0;
    if (n==1000) {
      return "onethousand".length();
    }

    // 3rd Digit
    if (n >= 100) {
      count += digits[n/100].length();
      count += hundred.length();
      n%=100;
      if (n > 0) {
        count += and.length();
      }
    }
    
    // 1st and 2nd Digit
    if (n < 20) {
      count += digits[n].length();
    }else{
      count += digits[n % 10].length();
      count += tenths[n / 10].length();
    }

    return count;
  }

}