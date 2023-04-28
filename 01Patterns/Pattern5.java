/*
    1
    2 3
    4 5 6
    7 8 9 10
 */

import java.util.Scanner;

/**
 * Pattern5
 */

public class Pattern5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern:");
        int lines = Sc.nextInt();
        int count=1,row,col=0;
        for (row = 0; row < lines; row++) {
            for (col = 0; col < row; col++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }    
}