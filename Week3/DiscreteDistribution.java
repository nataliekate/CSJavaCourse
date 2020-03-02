/**
 * DiscreteDistribution
 */
public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // trials
        int[] a = new int[args.length];
        int[] S = new int[args.length];
        int r; // random integer
        int i;

        for (int n = 1; n <= args.length - 1; n++) {
            a[n] = Integer.parseInt(args[n]);
            // System.out.print("a" + n + "= " + a[n] + " ");
            for (int j = 1; j <= n; j++) {
                S[n] += a[j];
            }
            // System.out.println("S" + n + " = " + S[n] + " ");
        }

        // generate m indices
        for (int k = 1; k <= m; k++) {
            i = 1;
            r = (int) (Math.random() * S[S.length - 1]);
            // System.out.print("Random number: " + r + " ");
            while (!(S[i - 1] <= r && S[i] > r)) {
                i++;
            }

            // System.out.print("unique index: " + i + " ");
            System.out.print(i + " ");
            if (k % 25 == 0)
                System.out.println();
        }

    }
}