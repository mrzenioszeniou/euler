package euler;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/
public class Problem22 {

  public static void solve(String path) {
    String content;
    try {
      content = Files.readString(Paths.get(path), Charset.forName("UTF-8"));
    } catch (Exception e) {
      System.out.println(e);
      return;
    }
    long sum = 0;
    long i = 1;
    ArrayList<String> names  = new ArrayList<>(Arrays.asList(content.split(",")).stream().map(n -> n.replace("\"","")).collect(Collectors.toList()));
    names.sort((a,b) -> a.compareTo(b));
    for (String name:names) {
      long score = name.chars().map(c -> c - 'A' + 1).sum();
      sum += score * i++;
    }
    System.out.println("Problem 22: "+sum);
  }

}