package Task2_Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        //Given a list of numbers how would you return a list of the square of each number?
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = nums.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(squares);

        //Given two lists of numbers, how would you return all pairs of numbers?
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);


    }






}
