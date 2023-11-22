public class KadaneAlgorithm {
    public static void main(String[] args) {
        // Find the sum of the contiguous subarray within a array[] with the largest sum

        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] array2 = {-2, -6, -1, -8, -2, -15};
        int[] array3 = {-10, -10, -20};
        int[] array4 = {-10, -10, -20, 1};
        int[] array5 = {11, -10, 20, 1, -22};
        System.out.println("Maximum contiguous sum is ");
        System.out.println(maxSubArraySum(array)); // 7
        System.out.println(maxSubArraySum(array2)); // -1
        System.out.println(maxSubArraySum(array3)); // -10
        System.out.println(maxSubArraySum(array4)); // 1
        System.out.println(maxSubArraySum(array5)); // 22
    }

    public static int maxSubArraySum(int array[]) {
        int size = array.length;
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + array[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
