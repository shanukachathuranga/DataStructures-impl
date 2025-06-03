/**
 * Selection sort algorithm implementation
 * Time complexity: O(n^2)
 */

public class SelectionSortImpl {

    private int findSmallest(int[] array, int length){
        int smallestValue = array[0];
        int smallestIndex = 0;
        for(int i = 1; i < (length); i++){
            if(smallestValue > array[i]){
                smallestValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;

    }

    public int[] sort(int[] array){
        int[] sortedArray = new int[array.length];
        int tempArrayLength = array.length;
        int tempSmallestIndex = 0;
        for(int i = 0; i < array.length; i++){
            tempSmallestIndex = findSmallest(array, tempArrayLength);
            sortedArray[i] = array[tempSmallestIndex];
            array[tempSmallestIndex] = array[tempArrayLength-1];
            tempArrayLength--;
        }
        return sortedArray;
    }

}
