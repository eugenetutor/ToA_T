package SortAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3,5,6,3,1234,45,35,235,2,1};
        int[] result =  selectionSort(array);
        outputMessage(result);
    }

    static int[] selectionSort(int[] array){
        int size = array.length;

        for(int step = 0; step < size - 1; step++){
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if(array[i] < array[min_idx]){
                    min_idx = i;
                }
            }
            swap(array, step, min_idx);
        }
        return array;
    }

    private static void swap(int[] array, int step, int min_idx) {
        int temp = array[step];
        array[step] = array[min_idx];
        array[min_idx] = temp;
    }

    static void outputMessage(int[] result){
        for (int j : result) {
            System.out.println(j);
        }
    }
}
