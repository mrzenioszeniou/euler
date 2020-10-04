package euler;

import java.math.BigInteger;

/* 
  Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
  there are exactly 6 routes to the bottom right corner. 

  How many such routes are there through a 20×20 grid?
*/
public class Problem15 {

  long rows;
  long columns;
  BigInteger[][] grid;

  public Problem15(int rows, int columns) {
    this.rows = rows;
    this.columns = columns;
    this.grid = new BigInteger[rows+1][columns+1];
    for (int i=0;i<=rows;i++) {
      for (int j=0;j<=columns;j++) {
        grid[i][j] = null;
      }
    }
  }

  public void solve() {
    System.out.println("Problem 15: "+ countPaths(0, 0));
  }

  private BigInteger countPaths(final int i, final int j) {
    if (this.grid[i][j] == null) {
      BigInteger count = BigInteger.ZERO;
      if (i<rows) {
        BigInteger subPaths = countPaths(i+1, j);
        if (subPaths.compareTo(BigInteger.ZERO) == 0) {
          count = count.add(BigInteger.ONE);
        } else {
          count = count.add(subPaths);
        }
      }
      if (j<columns) {
        BigInteger subPaths = countPaths(i, j+1);
        if (subPaths.compareTo(BigInteger.ZERO) == 0) {
          count = count.add(BigInteger.ONE);
        } else {
          count = count.add(subPaths);
        }
      }
      this.grid[i][j] = count;
    }

    return this.grid[i][j];
  }

  

}