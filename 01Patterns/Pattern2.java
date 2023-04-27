/*
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
 */

 import java.util.*;
 class Pattern2 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of lines for pattern:");
         int lines = input.nextInt();
         for (int row = 0; row < lines; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
         }
         input.close();
     }
 }