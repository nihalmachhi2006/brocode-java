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
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int m = scn.nextInt();

//        int sum = 0;

        int[][] ans = new int[n][m];
        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans.length; j++){
                ans[i][j] = scn.nextInt();

//                sum = sum + ans[i][j];
            }
        }

        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans.length; j++){
//                System.out.print(ans[i][j]+ " ");
                if(i%2 == 0){
                    System.out.print(ans[i][j]+ " ");
                }
                else{
                    System.out.print(ans[i][ans[i].length - 1 - j] + " ");
                }
            }
            System.out.println(" ");

        }
//        System.out.println(sum);
    }
}
