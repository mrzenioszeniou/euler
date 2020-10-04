package euler;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import common.Sequences;

/**
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation
 *  of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically,
 * we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
 * 
 * 012   021   102   120   201   210
 * 
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public class Problem24 {
  

  
  public static void solve() {

    final List<java.util.List<Long>> permutations = Sequences.permutations(List.of(0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L));

    System.out.println("Problem 24: "+ permutations.get(999999).stream().map(l -> ""+l).collect(Collectors.joining("")));
  }

}
