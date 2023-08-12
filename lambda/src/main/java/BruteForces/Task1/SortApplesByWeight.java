package BruteForces.Task1;

public class SortApplesByWeight implements AppleSorter{

    @Override
    public int sortApples(AppleSorting sorting) {
        int count = 0;
        for (int i=0; i<sorting.appleArray.length; i++){
            if (Integer.parseInt(sorting.appleArray[i][1]) > sorting.weightSorter) count++;
        }
        return count;
    }
}
