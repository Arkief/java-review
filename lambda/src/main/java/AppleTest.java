import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        /*List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        prettyPrintApple(inventory, new AppleWeightIndicator());
        System.out.println("**********************");
        prettyPrintApple(inventory, new AppleColorHeavyLight());*/

        List<Apple> greenApples = filterApples(inventory, apple -> apple.getWeight() > 150);
        System.out.println(greenApples);
        List<Apple> applesPrettyList = filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(applesPrettyList);
        System.out.println("****************************");
        prettyPrintApple(inventory, apple -> "An apple of " + apple.getWeight() + "g");
        System.out.println("****************************");
        prettyPrintApple(inventory, apple -> "A " + (apple.getWeight()>150 ? "HEAVY" : "LIGHT")
                +" " + apple.getColor() + " apple");

    }

    /*private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicate.test(apple)) result.add(apple);
        }
        return result;
    }*/

    //Same method with lambda expression
    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (p.test(apple)) result.add(apple);
        }
        return result;
    }

    private static void prettyPrintApple(List<Apple> inventory, Function<Apple, String> bp){
        for(Apple apple : inventory){
            String output = bp.apply(apple);
            System.out.println(output);
        }
    }
    /*
    Sample Output :           Sample Output :
    A Light GREEN apple       An apple of 80g
    A Heavy RED apple         An apple of 155g
    A Light GREEN apple       An apple of 120g
    */


}
