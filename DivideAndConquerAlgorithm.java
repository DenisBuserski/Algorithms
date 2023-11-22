public class DivideAndConquerAlgorithm {
    public static void main(String[] args) {
        // Divide: Involves dividing the problem into smaller sub-problems
        // Conquer: Solve sub-problems by calling recursively until solved.
        // Combine: Combine the sub-problems to get the final solution of the whole problem

        // In the Binary search there is only one sub-problem in each step and DAC requires that there must be 2 or more sub-problems

        int array[] = {70, 250, 50, 80, 140, 12, 14};

        int max = findMax(array, 0, array.length);
        int min = findMin(array, 0, array.length);

        System.out.printf("The minimum number in " +
                "array  given array is : %d\n", min);
        System.out.printf("The maximum number in " +
                "array  given array is : %d", max);
    }

    public static int findMax(int array[], int index, int length) {
        int max;
        if (length - 1 == 0) {
            return array[index];
        }
        if (index >= length - 2) {
            if (array[index] > array[index + 1]) {
                return array[index];
            } else {
                return array[index + 1];
            }
        }

        max = findMax(array, index + 1, length);

        if (array[index] > max) {
            return array[index];
        } else {
            return max;
        }
    }

    public static int findMin(int array[], int index, int length) {
        int min;
        if (length - 1 == 0) {
            return array[index];
        }
        if (index >= length - 2) {
            if (array[index] < array[index + 1]) {
                return array[index];
            } else {
                return array[index + 1];
            }
        }

        min = findMin(array, index + 1, length);

        if (array[index] < min) {
            return array[index];
        } else {
            return min;
        }
    }
}
