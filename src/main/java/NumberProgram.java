public class NumberProgram {

    public static int findResult(int[] values) {
        int largest = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }

        return largest;
    }
}
