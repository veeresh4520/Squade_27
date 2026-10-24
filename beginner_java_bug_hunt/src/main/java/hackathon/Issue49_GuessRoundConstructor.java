public class Issue49_GuessRoundConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Guess");
        System.out.println("Round ID: " + record.id);
        System.out.println("Secret word: " + record.name);
    }
}