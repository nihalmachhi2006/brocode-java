import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int m = scn.nextInt();

        int[][] ans = new int[n][m];
        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans.length; j++){
                ans[i][j] = scn.nextInt();
            }
        }
        int i, j;
//        for (i = 1; i <= n; i++) {
//            for (j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (j = i; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


//10 20 30 40 50 60 70 80 90
