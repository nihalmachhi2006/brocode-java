import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][]  ans = new int[rows][cols];

        for(int i = 0 ; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                ans[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print(ans[i][j] + " ");
                } else {
                    System.out.print("");
                }
            }
            System.out.print("");
        }
    }
}


//10 20 30 40 50 60 70 80 90
