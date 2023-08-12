package DoubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {

    public static void main(String[] args) {

        //Referencing to a static method
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s1.calculate(10,20);

        //Referencing to an instance method
        Calculate m1 = (x,y) -> new Calculator().findMultiplication(x,y);
        m1.calculate(10,20);

        Calculate m2 = new Calculator()::findMultiplication;
        m2.calculate(10,20);

        Calculator calculator = new Calculator();
        Calculate m3 = (x,y) -> calculator.findMultiplication(x,y);
        m3.calculate(10,20);

        Calculate m4 = calculator::findMultiplication;
        m4.calculate(10,20);

        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        String subStr = fn.apply("Nosche te ipsum", 7);
        System.out.println(subStr);

        BiFunction<String, Integer, String> fn2 = String::substring;
        String subStr2 = fn2.apply("Nosche te ipsum", 7);
        System.out.println(subStr2);

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(29);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(29);

        //Two Examples for using Functional Interfaces in different ways.
        BiFunction<MyClass, Integer, Double> v2= MyClass::method;
        Function<Integer, Double> vS = new MyClass()::method;//We have to pass the Class as another type

        BiFunction<String, String, String> v3 = String::concat;

    }
}
