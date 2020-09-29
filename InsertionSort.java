public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {1,2,5,3,5,13,4,52,46,21,24};
        for (int i = 1; i < arr.length;i++){
            int swap;
            for (int j = i; j > 0;j--){
                if (arr[j] < arr[j-1]){
                    swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + ",");
        }
    }

}
