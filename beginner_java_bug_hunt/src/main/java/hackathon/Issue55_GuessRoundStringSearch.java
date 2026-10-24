public class Issue55_GuessRoundStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Guess ID found");
        else System.out.println("Guess ID not found");
    }
}