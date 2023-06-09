import javax.swing.JOptionPane;

public class IntegerSortingDialogBox {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter integers separated by commas:",
                "Enter integers", JOptionPane.PLAIN_MESSAGE);
        String[] integerStrings = input.split("\\s*,\\s*");

        Integer[] integers = new Integer[integerStrings.length];
        for (int i = 0; i < integerStrings.length; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }

        bubbleSort(integers);

        String result = "";
        for (int i = 0; i < integers.length; i++) {
            result += integers[i];
            if (i < integers.length - 1) {
                result += ", ";
            }
        }

        JOptionPane.showMessageDialog(null, "Sorted integers in descending order:\n\n" + result +
                "\n ", "Result", JOptionPane.PLAIN_MESSAGE);
    }

    static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
