import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);

        int result = binarySearch(numbers, 0, numbers.size() - 1, 40);
        if (result == -1) {
            System.out.println("Number not present");
        } else {
            System.out.println("Number is at index: " + result);
        }
    }

    private static int binarySearch(List<Integer> numbers, int left, int right, int number) {
        int index = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left  + ((right - left) / 2);
            if (numbers.get(mid) < number) {
                left = mid + 1;
            } else if (numbers.get(mid) > number) {
                right = mid - 1;
            } else if (numbers.get(mid) == number) {
                index = mid;
                break;
            }
        }
        return index;
    }

    private static int binarySearchWithRecursion(List<Integer> list, int left, int right, int number) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == number) { // If the element is present at the middle itself
                return mid;
            }
            if (list.get(mid) > number) { // If element is smaller than mid, then it can only be present in left sub array
                return binarySearchWithRecursion(list, left, mid - 1, number);
            }
            // Else the element can only be present in right sub array
            return binarySearchWithRecursion(list, mid + 1, right, number);
        }
        // We reach here when element is not present in array
        return -1;
    }

}
