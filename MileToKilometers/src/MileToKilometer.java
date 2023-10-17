/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/04/2022
 * Assignment Convert miles to kilometers
 * 
 * Description: This program will prompt a user to enter the miles value. Then it will  
 * convert the value to the kilometers value and show the result. 
 */

import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args) throws Exception {

        //create a Scanner for Keyboard
        Scanner input = new Scanner(System.in);
        //prompt user for the value
        System.out.print("Enter miles: " );
        int miles = input.nextInt();

        //convert to kilometers and result
        float kilometers = (float)(miles * 1.6);
        System.out.print(miles + " miles is " + kilometers + " kilometers");
           
        input.close();
    }
}
