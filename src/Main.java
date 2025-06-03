import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] unsortedArray = {
                -45, 23, -8, 5, 17, -34, 2, 19, -41, 13,
                27, -6, 38, 12, -29, 1, 25, -9, 31, 15,
                -4, 22, -36, 11, 7, -30, 3, 18, -40, 14,
                26, -10, 32, -16, 21, 35, -24, 20, -39, 28,
                -12, 44, -18, 6, 39, -22, 8, 30, -27, 16,
                41, -33, 9, 37, -19, 4, 29, -7, 24, -38,
                10, -25, 36, -13, 40, -5, 33, -20, 42, -11,
                34, -21, 43, -14, 12, -28, 15, -17, 22, -23
        };

        int[] sortedArray = new SelectionSortImpl().sort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

    }
}
