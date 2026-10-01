package Problems.Easy;


// Leet_455
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || g.length == 0)
            return 0;

        quickSort(s, 0, s.length-1);
        quickSort(g, 0, g.length-1);

        // arrays sorted. 

        // |-------------------------------------------|
        int child  = 0;
        int cookie = 0;

        while(child < g.length && cookie < s.length){
            if(s[cookie] >= g[child])
                child++;

            cookie++;
        }

        return child; 

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
