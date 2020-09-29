public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,5,13,4,52,46,21,24};
        for (int i = 0; i < arr.length; i++){
            boolean check = false;
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] < arr[j + 1]){
                    swap(arr,j);
                    check = true;
                }
            }
            if (!check){
                break;
            }
        }
        for (int j : arr) {
            System.out.print(j + ",");
        }

    }
    public static void swap(int[]arr, int j){
        int flag = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = flag;
    }

}
