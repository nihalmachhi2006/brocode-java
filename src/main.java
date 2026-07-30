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

        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans.length; j++){
                if(j <= i){
                    System.out.print("*"+" ");
                }
            }
            System.out.println(" ");
        }
    }
}


//10 20 30 40 50 60 70 80 90
