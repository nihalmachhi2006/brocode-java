import java.util.*;
public class p1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);



        int rows = scn.nextInt();
        int col = scn.nextInt();
        int[][] ans = new int[col][rows];


        for(int i = 0; i<col; i++){
            for(int j = 0; j<rows; j++){
                ans[i][j] = scn.nextInt();

            }
        }
        int n = ans.length;

        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(ans[j][i] + " ");
            }
            System.out.println(" ");
        }


    }
}




