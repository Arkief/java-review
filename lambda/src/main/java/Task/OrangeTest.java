package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrangeTest {

    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().wight(200).color(Color.RED).build());
        inventory.add(Orange.builder().wight(100).color(Color.RED).build());
        inventory.add(Orange.builder().wight(500).color(Color.RED).build());
        inventory.add(Orange.builder().wight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWight() + "g";
        prettyPrintApple(inventory, simpleFormatter);

//        inventory.forEach(orange -> System.out.println("An orange of " + orange.getWight() + "g"));

        //We can pass the action directly as parameter
        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWight() + "g");

        System.out.println("*******************");

        Consumer<Orange> consumer = orange -> {
            Predicate<Orange> pred = orange1 -> orange1.getWight()>150;
            System.out.println("-> A " + (pred.test(orange) ? "HEAVY" : "LIGHT") + " " + orange.getColor() + " orange");
        };
        inventory.forEach(consumer);



        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWight() > 150 ? "HEAVY" : "LIGHT";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };
        //SINCE IT'S MORE THAN ONE LINE, WE USED CURLY BRACES AND "return" KEYWORD.
        prettyPrintApple(inventory, fancyFormatter);





    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for(Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }

    private static void prettyPrintOrange(List<Orange> inventory, Function<Orange, String> function){
        for(Orange orange : inventory){
            String output = function.apply(orange);
            System.out.println(output);
        }
    }

}
