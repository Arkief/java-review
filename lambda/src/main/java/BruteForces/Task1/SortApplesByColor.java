package BruteForces.Task1;

public class SortApplesByColor implements AppleSorter{

    @Override
    public int sortApples(AppleSorting sorting) {
        int count = 0;
        for (int i=0; i<sorting.appleArray.length; i++){
            if (sorting.appleArray[i][0].equalsIgnoreCase(sorting.colorSorter)) count++;
        }
        return count;
    }
}
