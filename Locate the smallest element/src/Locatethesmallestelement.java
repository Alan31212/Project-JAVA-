/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/12/2022
 * Assignment  Locate the smallest element
 * 
 * Description: This program will prompt a user to enter the row and column value, then enter the array value. It will  
 * locate the Smallest element and display the result. 
 */

import java.util.Scanner;

public class Locatethesmallestelement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //int rows
        System.out.print("Enter the size of the rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the size of columns: ");
        int columns = input.nextInt();

        double[][] Array = new double[rows][columns];

        System.out.println("Enter the array:");

        for (int i = 0; i < Array.length; i++){
          for (int j = 0; j < Array[i].length; j++){
            Array[i][j] = input.nextDouble();
          }
        }

        int[] location = locateSmallest(Array);

        System.out.println("The location of the smallest element is at (" 
                 + location[0] + ", " + location[1] + ")");         
    }    

    public static int[] locateSmallest(double[][] a){
        int l [] = new int[2];
        double min = a[0][0];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                    if (a[j][i] < min) {
                        l[0] = j;
                        l[1] = i;
                        min = a[j][i];
                    }
            }
        }
        return l;
    }
}


    
