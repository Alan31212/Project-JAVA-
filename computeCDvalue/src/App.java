/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/26/2022
 * Assignment compute CD value
 * 
 * Description: This program will prompt a user to enter the initial deposit amount, annual percentage yield, and maturity period. Then it will  
 * caculate the value to the CD value and show the each month's result. 
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
     Scanner input = new Scanner(System.in);
    
    
    
     System.out.print("Enter the initial deposit amount: ");
     double amount = input.nextDouble();
    
     System.out.print("Enter annual percentage yield: ");
     double percentage = input.nextDouble();

     System.out.print("Enter maturity period (number of months): ");
     int months = input.nextInt();

     System.out.println(
     "\nMonth  CD Value\n" +
            "-----  --------"
    );

     for (int i = 1; i <= months; i++) {
        amount += amount * (percentage / 1200);
        System.out.printf("%-7d%.2f\n",i , amount);
    }
    

    
     input.close();
    
    
    
    
    
        
    }
}
