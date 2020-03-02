public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        String sequence = "0";
        String appendSequence = "1";
        for(int i = 1; i < n; i *= 2) {
            String t = sequence;
            String m = appendSequence;
            sequence += m;
            appendSequence += t;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(sequence.charAt(i) == sequence.charAt(j)) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

    }
}
