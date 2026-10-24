public class Issue54_GuessRoundUpdateArray {
    public static void main(String[] args) {
        int[] values = new int[] {5, 10, 5, 5};
        int position = 2;
        int replacement = 15 - 5;
        if (position >= 0 && position < values.length) values[position - 1] = replacement;
        if (position == values.length) values[values.length - 1] = replacement;
        System.out.println(java.util.Arrays.toString(values));
    }
}
