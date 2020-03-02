/**
 * GeneralizedHarmonic.java
 * Reads two integer command-line arguments n and r, and
 * computes the nth generalized harmonic number of order r
 */
public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;

        // compute the nth generalized harmonic number of order r
        for (int i = 1; i <= n; i++) {
            sum += 1/Math.pow(i, r);
        }

        System.out.println(sum);
    }
}