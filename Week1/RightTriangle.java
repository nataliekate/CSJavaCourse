public class RightTriangle {
    public static void main(String[] args) {
        long a = Long.parseLong(args[0]);
        long b = Long.parseLong(args[1]);
        long c = Long.parseLong(args[2]);
        // Modification: 2020-02-22 consider overflow conditions
        boolean isPositive = (a > 0 && b > 0 && c > 0)
                && (a < Integer.MAX_VALUE && b < Integer.MAX_VALUE && c < Integer.MAX_VALUE);
        boolean isRightTriangle = ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a));
        // boolean isNotOverflow = ((a != 0 && (a * a > Integer.MAX_VALUE)) && (b != 0 && b * b > Integer.MAX_VALUE)
        //         && (c != 0 && c * c > Integer.MAX_VALUE));

        String output = Boolean.toString(isPositive && isRightTriangle);
        System.out.println(output);
    }
}
