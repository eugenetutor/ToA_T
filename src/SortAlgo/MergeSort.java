package SortAlgo;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 12, 7, 45, 34};
        int[] result = mergeSort(arr);
        outputMessage(result);
    }

    private static int[] mergeSort(int[] arr) {
        int inputLength = arr.length;

        if(inputLength>2){
            int middle = inputLength/2;
            int[] leftHalf = new int[middle];
            int[] rightHalf = new int[inputLength-middle];

            for(int i = 0; i<middle; i++){
                leftHalf[i] = arr[i];
            }

            for(int i = middle; i<inputLength; i++){
                rightHalf[i-middle] = arr[i];
            }
            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(arr,leftHalf,rightHalf);
        }
        return arr;
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;
        while(i<leftSize && j <rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j<rightSize){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }


    static void outputMessage(int[] result){
        for (int j : result) {
            System.out.println(j);
        }
    }
}
