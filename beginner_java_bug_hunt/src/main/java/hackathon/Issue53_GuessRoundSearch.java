public class Issue53_GuessRoundSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {5, 10, 5, 127};
        int target = 127;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
