public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,5,13,4,52,46,21,24};

        for (int i = 0; i < arr.length; i++){
            int index = 0;
            int min = arr[i];
            for (int j = i; j < arr.length;j++){
                if (arr[j] <= min){
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr,i,index);
        }
        for (int j : arr) {
            System.out.print(j + ",");
        }
    }
    public static void swap(int[]arr, int i,int index){
        int flag = arr[index];
        arr[index] = arr[i];
        arr[i] = flag;
    }


}
