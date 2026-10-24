public class Issue45_GuessRoundTotal {
    public static void main(String[] args) {
        int[] values = new int[] {5, -10, 5, 5};
        int total = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] >= 0) total += values[i];
            else total += values[i];
            if (values[i] == 0) total++;
        }
        System.out.println("Total=" + total);
    }
}
