import java.util.*;

public class mymain{
     public static void main(String[] args){
         Scanner scn = new Scanner(System.in);

         String ch = scn.next();

         for(int i = 0; i<=ch.length();i++){
             for(int j = 0; j<=ch.length() - i; j++)
                     System.out.print(ch.charAt(j));
             }
             System.out.println(" ");
         }
    }

