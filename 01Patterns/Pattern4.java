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
         for (row = 1; row <= lines; row++) {
            for (col = 1; col <= lines; col++) {
                if(row == 1 || col == 1 || (row+col)==lines)
                    System.out.print("* ");
            }
            System.out.println();
         }
         input.close();
     }
 }
}
