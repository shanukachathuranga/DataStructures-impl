import java.util.ArrayList;

/**
 * Quick sort implementation
 *
 */

public class QuickSortImpl {

    public ArrayList<Integer> sort(ArrayList<Integer> array){
        if(array.size() < 2){
            return array;
        }else{
            int pivot = array.get(0);
            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
            int value;
            for(int i = 1; i < array.size(); i++){
                value = array.get(i);
                if(value < pivot){
                    left.add(value);
                } else if (value > pivot) {
                    right.add(value);
                }
            }
            ArrayList<Integer> result = new ArrayList<>(sort(left));
            result.add(pivot);
            result.addAll(sort(right));
            return result;
        }
    }

}
