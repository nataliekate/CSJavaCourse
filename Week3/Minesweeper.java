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
        String[][] grid = new String[m][n];

        // put mines
        while(k > 0) {
            int randomM = (int) (Math.random() * m);
            int randomN = (int) (Math.random() * n);

            if(grid[randomM][randomN] == null) {
                grid[randomM][randomN] = "*";
                k--;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == null) {
                    grid[i][j] = "0";
                }
                System.out.print(grid[i][j]+ "  ");
            }
            System.out.println();
        }


    }
}
