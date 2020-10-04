package common;

import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;

public class Sets {
  
  /**
   * Returns all possible products that can be created by the given list of numbers
   */
  public static Set<Integer> subproducts(Collection<Integer> numbers) {
    Set<Integer> ret = new HashSet<>(Arrays.asList(1));

    for (int i: numbers) {
      Collection<Integer> additions = new ArrayList<>();
      for (int j: ret) {
        additions.add(i*j);
      }
      ret.addAll(additions);
    }
    return ret;
  }

}