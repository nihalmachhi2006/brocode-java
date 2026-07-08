import java.util.*;
public class p1 {
    public static void main(String[] args){
//        int[] arr = {10,20,30,10,10,30};
//        boolean[] check = new boolean[arr.length];
//
//        int n = arr.length;
//        for(int i  =0; i<n; i++){
//            if(!check[i]){
//                int count = 1;
//                for(int j=i+1; j<n; j++){
//                    if(arr[i] == arr[j]){
//                        count = count + 1;
//                        check[j] = true;
//                    }
//                }
//                System.out.println("the current element " + arr[i] +" count is " +count);
//            }
//        }
        int[] arr = {10,20,30,10,10,30};
        int n = arr.length;
        for(int i = 0; i< n; i++){
            int count = 1;
            for(int j=i+1; j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count >= n/2){
                System.out.println("the n/2 conditon is true count is "+ count);
            }
        }


    }
}
