package BruteForces.Task1;

public class AppleSorting {

    public String[][] appleArray = {
            {"Green", "150"},
            {"Red", "199"},
            {"Green", "250"},
            {"Red", "200"},
            {"Green", "201"},
            {"Red", "300"},
            {"Green", "297"},
            {"Green", "197"},
            {"Green", "200"}
    };

    public String colorSorter = "Green";

    public Integer weightSorter = 200;

    public static void main(String[] args) {

        AppleSorting appleSort = new AppleSorting();

        AppleSorter sortByColor = new SortApplesByColor();
        AppleSorter sortByWeight = new SortApplesByWeight();

        System.out.println("Number of green apples: " + appleSort.sortApples(sortByColor, appleSort));
        System.out.println("Number of apples heavier than 200 g: " + appleSort.sortApples(sortByWeight, appleSort));

    }

    private int sortApples(AppleSorter sorter, AppleSorting appleSorting) {
        return sorter.sortApples(appleSorting);
    }

}
