public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,5,13,40,52,46,21,24};

        quickSort(arr,0,arr.length-1);
        for (int i : arr){
            System.out.print(i + ",");
        }
    }

    public static int partition(int[] arr, int high, int low){
        int pivot = arr[high];
        int left = low;
        int right = high -1;
        while (left < right){
            if ( arr[left]>pivot && arr[right]<pivot){
                int swap = arr[left];
                arr[left] = arr[right];
                arr[right] = swap;
                left++;
                right--;
            }
            if(arr[left] < pivot){
                left++;
            }
            if (arr[right] > pivot){
                right--;
            }
        }
        int swap = arr[arr.length-1];
        arr[arr.length-1] = arr[left];
        arr[left] = swap;
        return left;
    }

    public static void quickSort(int arr[],int low,int high){
        if (low < high){
            int pi = partition(arr,high,low);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
}
