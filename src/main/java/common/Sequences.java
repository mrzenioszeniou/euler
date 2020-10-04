package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Everybody loves a good sequence, especially if it's convergent.
 */
public class Sequences {

  /**
   * Produces a Collatz sequence starting from the given number. WARNING: May never return.
   * @param start - Startng number. Will be included in the sequence;
   * @return
   */
  public static List<Long> collatz(long start) {
    List<Long> ret = new ArrayList<>();
    ret.add(start);
    long n = start;
    while(n != 1) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = 3*n + 1;
      }
      ret.add(n);
    }
    return ret;
  }

  /**
   * Returns all permutations of the given list in a lexicographic order
   */
  public static List<List<Long>> permutations(final List<Long> list) {
    final List<List<Long>> ret = new ArrayList<>();

    if (list.isEmpty()) {
      ret.add(new ArrayList<>());
      return ret;

    }

    final List<Long> sorted = list.stream().sorted().collect(Collectors.toList());

    for (int i = 0; i < sorted.size(); i++) {
      final List<Long> sublist = new ArrayList<>(sorted);
      sublist.remove(i);
      final List<List<Long>> combos = permutations(sublist);
      for (final List<Long> combo : combos) {
        combo.add(0, sorted.get(i));
        ret.add(combo);
      }
    }

    return ret;
  }


  /**
   * Returns the first n fibonacci numbers
   */
  public static List<Long> fibonacci(final int n) {

    if (n < 0) throw new IllegalArgumentException("Negative number provided for fibonacci series");

    List<Long> ret = new ArrayList<>();

    if (n == 0) {
      return ret;
    }

    if (n == 1) {
      ret.add(1L);
      return ret;

    }
    
    if (n == 2) {
      ret.add(1L);
      ret.add(1L);
      return ret;
    }

    ret = fibonacci(n-1);

    ret.add(ret.get(n-2) + ret.get(n-3));

    return ret;
  }
}