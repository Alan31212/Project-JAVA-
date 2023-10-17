/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/04/2022
 * Assignment Calculate future investment value
 * 
 * Description: This program will prompt a user to enter the investment amount, monthly interest rate and the number of years. Then it will  
 * caculate the value of the future value and show the result. 
 */

import java.util.Scanner;

public class Calculatefutureinvestmentvalue {
    public static void main(String[] args) throws Exception {
        //create a Scanner for Keyboard
        Scanner input = new Scanner(System.in);
        //prompt user for the value
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;

        System.out.print("Enter number of years: ");
        int numberofYears = input.nextInt();
        //caculate the future value and result
        double FutureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberofYears * 12);
        System.out.print("Future value is $" + (int)(FutureInvestmentValue * 100) / 100.0);

        input.close(); 
    }
}
