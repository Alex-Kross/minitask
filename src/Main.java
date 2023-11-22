import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i = sortDesc(42145);
        int j = sortDesc(145263);
        int k = sortDesc(123456789);
        int f = sortDesc(3);

    }

    public static int sortDesc(final int number) {
        List<Integer> arrayOfNumbers = new ArrayList<>();
        int value = number;

        while (value != 0) {
            arrayOfNumbers.add(value % 10);
            value /= 10;
        }
        if (arrayOfNumbers.size() == 1) {
            return arrayOfNumbers.get(0);
        }

        Collections.sort(arrayOfNumbers);
        Collections.reverse(arrayOfNumbers);

        StringBuilder numberStr = new StringBuilder();
        for (Integer element: arrayOfNumbers) {
            numberStr.append(element);
        }

        return Integer.parseInt(numberStr.toString());
    }
}