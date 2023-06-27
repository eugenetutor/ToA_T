package SortAlgo;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,12,7,45,34};
        int[] result = quickSort(arr,0,arr.length-1);
        outputMessage(result);
    }

    static int[] quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivot  = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot+1, end);
        }
        return  arr;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for(int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return (i+1);
    }




    static void outputMessage(int[] result){
        for (int j : result) {
            System.out.println(j);
        }
    }
}
