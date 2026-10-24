public class Issue55_GuessRoundStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A27", "B27", "C27"};
        String target = new String("B27");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
