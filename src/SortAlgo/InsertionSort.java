package SortAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3,5,6,3,1234,45,35,235,2,1};
        int[] result =  insertionSort(array);
        outputMessage(result);
    }

    static int[] insertionSort(int[] array){
        int size = array.length;

        for(int step = 1; step < size; step++){
            int key = array[step];
            int j = step - 1;
            while(j >= 0 && key < array[j]){
                array[j+1]  = array[j];
                --j;
            }
            array[j+1] = key;
        }
        return  array;
    }

    static void outputMessage(int[] result){
        for (int j : result) {
            System.out.println(j);
        }
    }
}
