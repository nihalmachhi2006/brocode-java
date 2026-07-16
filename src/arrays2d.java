import java.util.*;
public class arrays2d {
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
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
