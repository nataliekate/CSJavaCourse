public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // Modification: 2020-02-22 consider overflow conditions
        boolean isPositive = (a > 0 && b > 0 && c > 0)
                && (a < Integer.MAX_VALUE && b < Integer.MAX_VALUE && c < Integer.MAX_VALUE);
        boolean isRightTriangle = ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a));
        boolean isNotOverflow = ((a != 0 && ((long) a * (long) a > Integer.MAX_VALUE))
                && (b != 0 && (long) b * (long) b > Integer.MAX_VALUE)
                && (c != 0 && (long) c * (long) c > Integer.MAX_VALUE));

        String output = Boolean.toString(isPositive && isRightTriangle && isNotOverflow);
        System.out.println(output);
    }
}
