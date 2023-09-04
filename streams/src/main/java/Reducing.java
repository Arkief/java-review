import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {

    public static void main(String[] args) {

        //With initial value
        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);

        //No initial value
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(result2);

        //Max and min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("Min.: " + min.get());
        System.out.println("Max.: " + max.get());
        System.out.println("Sum: " + sum.get());

        int dishCount = DishData.getAll().stream()
                .map(d -> 1).reduce(0, Integer::sum);
        System.out.println(dishCount);

        long dcount = DishData.getAll().stream().count();
        System.out.println(dcount);

        //Creating Infinite Streams
        System.out.println("***************************");
        Stream.iterate(0, n->n+2)
                .limit(5)
                .forEach(System.out::println);


    }
}
