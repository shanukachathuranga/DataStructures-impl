
/**
 *  Binary Search Implementation
 *  Works for sorted lists
 *  Time complexity Big O(Log n)
 */

public class BinarySearchImpl {
    public int[] search(int[] sortedList, int searchNumber){
        int low = 0;
        int high = sortedList.length - 1;
        int mid = (low + high)/2;
        int iterations = 0;
        int[] dataArray = {-1,-1};
        if(sortedList[low] == searchNumber){
            dataArray[0] = low;
            dataArray[1] = iterations;
            return dataArray;
        }else if(sortedList[high] == searchNumber){
            dataArray[0] = high;
            dataArray[1] = iterations;
            return dataArray;
        }else{
            do{
                iterations++;
                if(sortedList[mid] == searchNumber){
                    dataArray[0] = mid;
                    dataArray[1] = iterations;
                    return dataArray;
                }else if(mid == low || mid == high){
                    dataArray[0] = -1;
                    dataArray[1] = iterations;
                    return dataArray;
                }else{
                    mid = (low + high)/2;
                    if(searchNumber > sortedList[mid]){
                        low = mid+1;
                    }else if(searchNumber < sortedList[mid]){
                        high = mid-1;
                    }
                }
            }while(true);
        }
    }

}
