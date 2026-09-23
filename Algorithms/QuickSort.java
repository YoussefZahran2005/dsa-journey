import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data)); // Output: [1, 5, 7, 8, 9, 10]
    }


    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);  
            quickSort(arr, pivotIndex+1, high);
            
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low; 
        int j = high; 

        while(i < j) {
            while(arr[i] <= pivot && i < high){
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }

            // i didn't understand this first hand but it does the swap thing. 
            // and it make sure i didn't cross the line (yet). 
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j; // the pivot *index*. 

    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
