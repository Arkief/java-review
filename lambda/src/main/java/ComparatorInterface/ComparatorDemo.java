package ComparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list =Arrays.asList(10,0,15,20);
        System.out.println(list);

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1,o2) -> (o1>o2) ? -1 : (o2>o1) ? 1 : 0));

        //Ascending
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        //Descending
        list.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(list);

        //1. Create a list of objects
        List<Apple> myInventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.RED),
                new Apple(120, Color.GREEN)
        );

        //2. Use Comparator.comparing method to sort the list
        Comparator<Apple> sortApple = comparing(apple -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        //3. Import static Comparator and use it inside the myInventory.sort method parenthesis
        myInventory.sort(comparing(apple -> apple.getWeight()));

        //4. Use double colon operator instead of lambda expression
        myInventory.sort(comparing(Apple::getWeight));

        //Reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //Chaining
        myInventory.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));
        System.out.println(myInventory);


    }
}
