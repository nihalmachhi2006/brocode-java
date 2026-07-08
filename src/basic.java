import java.util.Scanner;
import java.math.*;
public class basic{
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);

       int key = scn.nextInt();
       int[] arr = new int[]{10,20,30,40,50};
       int ans = checkforcount(key,arr);
        System.out.println(ans);
     }
    static int checkforcount(int key,int[]arr){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[key] == arr[i]){
                if(arr[key] < i){
                    count++;
                }
            }
        }
        return count;
    }
}