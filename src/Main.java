import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        StreamMain streamNumber = new StreamMain();
        streamNumber.streamNumber(intList);
        positiveEvenSort(intList);

    }

    public static List<Integer> positiveEvenSort(List<Integer> intList) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int number : intList) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : positiveNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        Collections.sort(evenNumbers);
        for (int number : evenNumbers) {
            System.out.println(number);

        }
        return positiveNumbers;
    }
}



