/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/17/2022
 * Assignment Cost of Shipping
 * 
 * Description: This program will prompt a user to enter the weight. Then it will  
 * caculate the shipping cost value and show the result. 
 */

 
import java.util.Scanner; 

public class CostofShipping {
  public static void main(String[] args) {
   
    // Create a Scanner
    double pounds = 0.0;
    double CostofShipping = 0.0;
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the pounds
    System.out.print("Enter the pounds: ");
    pounds = input.nextDouble();

    // caclulate the shipping cost
    if (pounds <= 1.)
        CostofShipping = 3.50;
      else if (pounds > 1 && pounds <= 3)
        CostofShipping = 5.50;
      else if (pounds > 3 && pounds <= 10 )
        CostofShipping = 8.50;    
      else if (pounds > 10 && pounds<= 20)
        CostofShipping = 10.50;
      else if (pounds > 20)
        System.out.println("The package cannot be shipped.");
    

    // Output
    System.out.println("The Shipping cost is " + CostofShipping);

    input.close();
  }
}