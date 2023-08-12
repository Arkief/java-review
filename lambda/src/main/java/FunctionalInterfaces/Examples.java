package FunctionalInterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //************PREDICATE*************
//        Anonymous class
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//        };
//
//        System.out.println(lesserThan.test(50));

        //Implementation of the test method that belongs to Predicate interface
        Predicate<Integer> lesserThan = integer -> integer < 18;
        //Using test method by passing an integer as parameter.
        Boolean result = lesserThan.test(50);
        System.out.println(result);
        //Or with a shorter way:
        System.out.println(lesserThan.test(50));

        //************CONSUMER*************
        //1. Implementation of the method
        Consumer<Integer> display = integer -> System.out.println(integer);
        //2. Execute the method
        display.accept(50);

        //************BICONSUMER*************
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //************FUNCTION*************
        Function<String, String> fun = s -> "Hello " + s + "!";
        Function<String, Integer> func = s -> Integer.parseInt(s) + 10;
        Function<String, Integer> length = str -> str.length();

        String str = fun.apply("Alex");
        System.out.println(str);

        Integer resInt = func.apply("23");
        System.out.println(resInt);

        int strLength = length.apply("I love coding!");
        System.out.println(strLength);

        //************SUPPLIER*************
        Supplier<Double> randomValue = () -> Math.random();
        Double randomDouble = randomValue.get();
        System.out.println(randomDouble);


    }
}
