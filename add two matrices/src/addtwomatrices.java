/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/12/2022
 * Assignment add two matrices
 * 
 * Description: This program will prompt a user to enter the two matrices. Then it will  
 * convert the value to the sum of the matrices.
 */

import java.util.Scanner;

public class addtwomatrices {
    public static void main(String[] args) throws Exception {
        
        double[][] matrix1 = getmatrix(1);
        double[][] matrix2 = getmatrix(2);

        double[][] matrix3 = addMatrix(matrix1, matrix2);
        print(matrix1, matrix2, matrix3);
    }    

    public static double[][] getmatrix(int n) {
        Scanner input = new Scanner(System.in);
        double[][] m1 = new double[3][3];
        System.out.println("Enter matrix " + n);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
              m1[i][j] = input.nextDouble();   
        }

        return m1;
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;    
    }

    public static void print(double[][] m1, int r){
        for (int j = 0; j < m1[r].length; j++){
            System.out.print(m1[r][j] + " ");
        }
    }


    public static void print(double[][]m1, double[][]m2, double[][]m3){
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++){
            print(m1, i);       
            System.out.print((i == 1 ? " +  " : "    "));
            print(m2, i);       
            System.out.print((i == 1 ? " =  " : "    "));
            print(m3, i);       
            System.out.println();
            
        }
    }    
}




