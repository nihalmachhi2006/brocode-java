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
import java.util.*;
public class arrays2d {
public static void main(String[] args){

//        Scanner scn = new Scanner(System.in);
//        int n  = scn.nextInt();
//        int m = scn.nextInt();
//
//        int[][] ans = new int[n][m];
//        for(int i = 0; i<ans.length; i++){
//            for(int j = 0; j<ans.length; j++){
//                ans[i][j] = scn.nextInt();
//            }
//        }
//
//        for(int i = 0; i<ans.length; i++){
//            for(int j = 0; j<ans.length; j++){
//                System.out.print(ans[i][j]+ " ");
//            }
//            System.out.println(" ");
//        }
//        Scanner scn = new Scanner(System.in);
//        int n  = scn.nextInt();
//        int m = scn.nextInt();
//
//        int sum = 0;
//
//        int[][] ans = new int[n][m];
//        for(int i = 0; i<ans.length; i++){
//            for(int j = 0; j<ans.length; j++){
//                ans[i][j] = scn.nextInt();
//
//                sum = sum + ans[i][j];
//            }
//        }
//
//        for(int i = 0; i<ans.length; i++){
//            for(int j = 0; j<ans.length; j++){
//                System.out.print(ans[i][j]+ " ");
//            }
//            System.out.println(" ");
//
//        }
//        System.out.println(sum);
//        Scanner scn = new Scanner(System.in);
//        int n  = scn.nextInt();
//        int m = scn.nextInt();
//
////        int sum = 0;
//
//        int[][] ans = new int[n][m];
//        for(int i = 0; i<ans.length; i++){
//            for(int j = 0; j<ans.length; j++){
//                ans[i][j] = scn.nextInt();
//
////                sum = sum + ans[i][j];
//            }
//        }
//
//        for(int i = 0; i<ans.length; i++){
//            for(int j = 0; j<ans.length; j++){
////                System.out.print(ans[i][j]+ " ");
//                if(i%2 == 0){
//                    System.out.print(ans[i][j]+ " ");
//                }
//                else{
//                    System.out.print(ans[i][ans[i].length - 1 - j] + " ");
//                }
//            }
//            System.out.println(" ");
//
//        }
//        System.out.println(sum);
Scanner scn = new Scanner(System.in);
int n  = scn.nextInt();
int m = scn.nextInt();

        int[][] ans = new int[n][m];
        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans.length; j++){
                ans[i][j] = scn.nextInt();
            }
        }

        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans.length; j++){
                if(j%2  == 0){
                    System.out.print(ans[j][i]+ " ");
                }
                else{
                    System.out.print(ans[j][i]+ " ");
                }

            }
            System.out.println(" ");
        }
    }
}
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

import java.util.Scanner;

public class main {
public static void main(String[] args) {

        guessNo();
    }

    static void guessNo() {
        Scanner sc = new Scanner(System.in);

        int num = 28;
        int guess;

        do {
            System.out.print("Enter Number between 1 to 100: ");
            guess = sc.nextInt();

            if (num > guess ) {
                System.out.println("its bigger than "+guess);
            } else if (num < guess) {
                System.out.println("its smaller than "+guess);
            } else {
                System.out.println("Your guess is right, number is "+guess);
            }

        } while (guess != num);

        sc.close();
    }


}