import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //Print all dishes' names that has less than 400 calories.
        System.out.println("***********************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print length of the name of each dish
        System.out.println("***********************************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print three high caloric dish name (>300)
        System.out.println("***********************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Prınt all dısh names that are below 400 calories in sorted (descending)
        System.out.println("***********************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted((comparing(Dish::getCalories)).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
