/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/26/2022
 * Assignment heads or tails
 * 
 * Description: This program will prompt a user to enter the number of times to flip the coin. Then it will  
 * execute the value randomly and show result. 
 */

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int flipcount;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number of times to flip the coin: ");
       flipcount = input.nextInt();
       Random random = new Random();
       int counter = 1;
       int headcounter = 0;
       int tailcounter = 0;
       while (counter <= flipcount) {
          System.out.print(counter + " "); 
          int coinFlip = random.nextInt(2);
          if (coinFlip == 1){
            System.out.println("Heads");
            headcounter++;
          } else {
            System.out.println("Tails");
            tailcounter++;
          }
          counter++;
       }
        System.out.println("Heads was flipped " + headcounter + " times");
        System.out.println("Tails was flipped " + tailcounter + " times");

    
    }
}
