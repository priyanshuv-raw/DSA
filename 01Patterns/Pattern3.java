/*
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */

 import java.util.*;
 class Pattern3 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of lines for pattern:");
         int lines = input.nextInt();
         for (int row = lines; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
         }
         input.close();
     }
 }