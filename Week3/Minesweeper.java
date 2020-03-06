/******************************************************
 * Minesweeper.java
 *
 * Deduce which cells contain hidden mines using
 * clues about the number of mines in neighboring cells
 * takes three integer command-line arguments m, n, and k
 * prints an m-by-n grid of cells with k mines, using
 * asterisks for mines and integers for the neighboring
 * mine counts (with two space characters between each cell)
 *
 *
 ******************************************************/
public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // initialize grid
        int[][] grid = new int[m][n];

        // put mines
        while(k > 0) {
            int randomM = (int) (Math.random() * m);
            int randomN = (int) (Math.random() * n);

            if(grid[randomM][randomN] != -1) {
                grid[randomM][randomN] = -1;
                k--;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                // count number of neighboring mine
                // above
                if(i > 0) { // second row and after
                    if(grid[i][j] != -1 && grid[i - 1][j] == -1) {
                        grid[i][j]++;
                    }
                    if(j > 0) {
                        // upperleft
                        if(grid[i][j] != -1 && grid[i - 1][j - 1] == -1) {
                            grid[i][j]++;
                        }
                    }
                    if(j < n - 1) {
                        // upperright
                        if(grid[i][j] != -1 && grid[i - 1][j + 1] == -1) {
                            grid[i][j]++;
                        }
                    }
                }

                if(j > 0) { // second column and after
                    // left
                    if(grid[i][j] != -1 && grid[i][j - 1] == -1) {
                        grid[i][j]++;
                    }
                    if(i < m - 1) {
                        // lowerleft
                        if(grid[i][j] != -1 && grid[i + 1][j - 1] == -1) {
                            grid[i][j]++;
                        }
                    }
                }

                if(i < m - 1) {
                    // below
                    if(grid[i][j] != -1 && grid[i + 1][j] == -1) {
                        grid[i][j]++;
                    }
                }

                if(j < n - 1) {
                    // right
                    if(grid[i][j] != -1 && grid[i][j + 1] == -1) {
                        grid[i][j]++;
                    }
                }

                if(i < m - 1 && j < n - 1) {
                    // lowerright
                    if(grid[i][j] != -1 && grid[i + 1][j + 1] == -1) {
                        grid[i][j]++;
                    }
                }
            }
//            System.out.println();
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == -1) {
                    System.out.print("*  ");
                } else {
                    System.out.print(grid[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
