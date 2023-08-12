public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);
        //Here we created classes that implement the interface for each behaviour.
        //Then we used the object of that classes to pass as parameter with the sort method.

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);
        Sorting bubbleSort = () -> System.out.println("Bubble sorting");
        as.sort(bubbleSort);
        //Here we skipped the need to create separate classes for each behaviour,
        //and we implement the behaviours inside the lambda expression.
        //We can also use it like this:
        as.sort(() -> System.out.println("Quick sorting"));
        as.sort(() -> System.out.println("Bubble sorting"));
        //We passed directly the action itself. That's an example for the functional programming.
        //We are performing the behaviour parameterization directly through lambda expression.

    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }

}

