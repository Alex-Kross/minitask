import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {
        int i = sortDesc(42145);
        int j = sortDesc(145263);
        int k = sortDesc(123456789);
        int f = sortDesc(3);
        int s = sortDesc(0);
        int g = sortDesc(-3);
    }

    public static int sortDesc(final int number) {
        if (number < 0) {
            throw new RuntimeException("Number need to be positive!");
        }
        if (number < 10) {
            return number;
        }

        List<Integer> arrayOfNumbers = new ArrayList<>();
        int value = number;

        while (value != 0) {
            arrayOfNumbers.add(value % 10);
            value /= 10;
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