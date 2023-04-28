    /*
    * * * * * *
    *       *
    *     *
    *   *
    * *
    *
 */

 import java.util.*;
 class Pattern4 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of lines for pattern:");
         int lines = input.nextInt();
         int row,col =1;
         for (row = 0; row < lines; row++) {
            for (col = 0; col < lines; col++) {
                if(row == 0 || col == 0 || (row+col)==lines-1){
                    System.out.print("* ");}
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
         }
         input.close();
     }
 }
