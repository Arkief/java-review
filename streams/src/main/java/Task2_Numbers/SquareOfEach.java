package Task2_Numbers;

import java.util.Arrays;
import java.util.List;

public class SquareOfEach {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .map(i -> i*i)
                .forEach(System.out::println);
    }
}
