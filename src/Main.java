public class Main {
    public static void main(String[] args){
        int[] sortedArray = {-50, -23, -10, 0, 2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91, 105, 150, 200, 350, 500, 1000};

        BinarySearchImpl binarySearch = new BinarySearchImpl();

        int[] result4 = binarySearch.search(sortedArray, 1);
        if (result4[0] == -1) {
            System.out.println("Not found in the array, iterations: "+ result4[1]);
        } else {
            System.out.println("Found at index " + result4[0]+" iterations: "+ result4[1]);
        }


    }
}
