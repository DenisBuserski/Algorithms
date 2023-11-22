public class BubbleSort {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int array[]) {
        int n = array.length;

        for (int index = 0; index < n - 1; index++) {
            for (int index2 = 0; index2 < n - index - 1; index2++) {
                if (array[index2] > array[index2 + 1]) {
                    int temp = array[index2];
                    array[index2] = array[index2 + 1];
                    array[index2 + 1] = temp;
                }
            }
        }
    }
    
}
