import java.util.*;

public class array {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,5,3,4,7,8,11,25,2,1};
        int maxsum = -1;
        int currsum = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxsum){
                currsum = maxsum;
                maxsum = arr[i];

            }
            else if(arr[i] != maxsum && arr[i] > currsum){
                    currsum = arr[i];
            }
        }
        System.out.println(currsum);
    }
}
