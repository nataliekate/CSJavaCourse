/**
 * RandomWalkers.java
 * 
 * Takes two integer command-line arguments r and trials, and simulates the
 * motion of a random walk until the random walker is at Manhattan distance r
 * from the starting point
 */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        long trials = Long.parseLong(args[1]);

        int x = 0;
        int y = 0;
        int steps = 0;
        double probability = 0;

        for (int i = 0; i < trials; i++) {
            x = 0;
            y = 0;

            while (Math.abs(x) + Math.abs(y) != r) {
                probability = Math.random();

                if (probability <= 0.25) {
                    // go north
                    y += 1;
                    steps++;
                } else if (probability > 0.25 && probability <= 0.5) {
                    // go east
                    x += 1;
                    steps++;
                } else if (probability > 0.5 && probability <= 0.75) {
                    // go south
                    y -= 1;
                    steps++;
                } else {
                    // go west
                    x -= 1;
                    steps++;
                }
            }
        }

        System.out.println("average number of steps = " + (steps / (double)trials));
    }
}