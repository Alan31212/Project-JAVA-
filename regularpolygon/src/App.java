/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/19/2022
 * Assignment regular polygon
 * 
 * Description: This program will prompt a user to enter the number of sides and the length of the sides. It will  
 * caculate to the area of the polygon value and the perimeter of the polygon, then show the result. 
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

       Scanner input = new Scanner(System.in);

       System.out.print("Enter the number of sides: ");
       int n = input.nextInt();

       System.out.print("Enter the length of the sides: ");
       double s = input.nextDouble();
   
       double area = (n*s*s)/(4*Math.tan(Math.PI/n));
       double perimeter = (n*s);

       System.out.println("The area of the polygon is " + area);
       System.out.println("The perimeter of the polygon is " + perimeter);
       
    
       input.close();
    }
}
