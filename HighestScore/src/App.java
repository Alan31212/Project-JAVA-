/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/27/2022
 * Assignment Find the highest score
 * 
 * Description: This program will prompt a user to enter the student score. When I type the stop, then it will  
 * caculate the highest score and show the result. 
 */

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        String highestscorename = "";
        float highestscore = 0;
        float Score = 0;
        String studentname = "[stop]";
        int length = studentname.length();

       
           
      do{System.out.print("Enter the student's name: ");
         studentname = input.next();
         System.out.print("Enter " + studentname + "'s score: ");
         Score = input.nextFloat();
         Score++;
      
      }while(Score > highestscore);
            highestscore = Score;
            highestscorename = studentname; 
  
       System.out.println(highestscorename + " has the highest score, " + highestscore);             
     
             
        
       
       
      input.close();
      //   input.next().equals("[stop]"     
      //    System.out.print("Enter the student's name: ");
      //    studentname = input.next();  
      //   System.out.print("Enter " + studentname + "'s score: ");
      //    Score = input.nextInt(); 

      //   for(i = 0; i < length; i++){
      //   System.out.print("Enter the student's name: ");
      //   studentname = input.next();  
      //   System.out.print("Enter " + studentname + "'s score: ");
      //   Score = input.nextInt();
      //   Score++
             
    }
}
