public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int peopleSum = 1;
        int[] count = new int[n];

        for(int i = 0; i < trials; i++) {
            boolean[] room = new boolean[n];
            int people = 0;

            while(true) {
                // Choose a birthday for the next person, uniformly at random between 0 and n-1
                int randomBirthday = (int) (Math.random() * n);
                people++;
                if(room[randomBirthday]) {
                    count[people]++;
                    break;
                }
                room[randomBirthday] = true;
            }
        }

        int accumulatedCount = 0;
        for(int j = 1; j < count.length; j++) {
            accumulatedCount += count[j];
            double probability = (double) accumulatedCount / trials;
            System.out.printf("%-10d%-10d%-16s\n", j, count[j], probability);

            if(probability >=0.5) break;
        }
    }
}
