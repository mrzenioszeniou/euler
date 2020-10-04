package euler;

import java.time.Duration;
import java.util.Date;

/* 
  You are given the following information, but you may prefer to do some research for yourself.

  1 Jan 1900 was a Monday.
  Thirty days has September,
  April, June and November.
  All the rest have thirty-one,
  Saving February alone,
  Which has twenty-eight, rain or shine.
  And on leap years, twenty-nine.
  A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

  How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/
public class Problem19 {
  
  private static Duration DAY = Duration.ofDays(1);

  public static void solve() {
    int cnt = 0;
    
    Date date = new Date(1, 0, 1);
    
    while (date.getYear() + 1900 < 2001) {
      if (date.getDay() == 0 && date.getDate() == 1) {
        cnt++;
        System.out.println(date);
      }
      date = Date.from(date.toInstant().plus(DAY));
    }

    System.out.println("Problem 19: " + cnt);
  }

}