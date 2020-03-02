/**
 * RandomWalker.java
 * 
 * Takes an integer command-line argument r, and simulates the motion of a
 * random walk until the random walker is at Manhattan distance r from the
 * starting point
 */
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        double probability;

        while (Math.abs(x) + Math.abs(y) != r) {
            probability = Math.random();

            System.out.println("(" + x + ", " + y + ")");

            if (probability <= 0.25) {
                // go north
                y += 1;
                steps ++;
            } else if (probability > 0.25 && probability <= 0.5) {
                // go east
                x += 1;
                steps ++;
            } else if (probability > 0.5 && probability <= 0.75) {
                // go south
                y -= 1;
                steps ++;
            } else if (probability > 0.75) {
                // go west
                x -= 1;
                steps ++;
            }
        }

        System.out.println("(" + x + ", " + y + ")"); // print final place
        System.out.println("steps = " + steps);
    }
}