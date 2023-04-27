/*
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
 */

import java.util.*;
class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines for pattern:");
        int lines = input.nextInt();
        int len = lines*lines;
        for (int row = 1; row <= len; row++) {
            System.out.print("* ");
            if(row%lines == 0){
                System.out.println();
            }
        }
        input.close();
    }
}