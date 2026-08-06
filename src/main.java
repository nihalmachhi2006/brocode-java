import java.util.*;

class Main {
    public static void selectionSort(int n, int[] arr){
//        for(int i = 0; i < n-1; i++){
//            int min = i;
//            for(int j = i+1; j < n; j++){
//                if(arr[min] > arr[j]){
//                    min = j;
//                }
//            }
//
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j  >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {64,22, 34, 11, 12};
        selectionSort(n, arr);
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}