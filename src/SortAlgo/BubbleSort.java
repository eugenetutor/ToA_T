package SortAlgo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,6,3,1234,45,35,235,2,1};
        int[] output = bubbleSort(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    static int[] bubbleSort(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
