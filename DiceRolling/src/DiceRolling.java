/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/08/2022
 * Assignment Dice Rolling
 * 
 * Description: This program will roll the dice twice and sum of the two values should be calculated. 
 * Then show the results in tabular format.  
 * 
 */

import javax.swing.JOptionPane;

public class DiceRolling {
    public static void main(String[] args) throws Exception {
        String input = "";
        int dice[][] = new int [6][6];

        int dicetotals[] = new int[13];
        int radomdice1 , radomdice2;

        //create menu
        while(!input.equals("2")){
            input = JOptionPane.showInputDialog("1 - Roll the dice\n2 - Exit program");

            if(input.equals("1")){
                //roll the dice
                //initialize the dice array to zeros
                for(int i = 0; i < 6; i++) {
                    for(int j = 0; j < 6; j++){
                        dice[i][j] = 0;
                    }
                }
                // initialize the dicetotals array to zeros
                for(int i = 0; i < dicetotals.length; i++){
                    dicetotals[i] = 0;
                }
                //Generate 36000 dice rolls and keep track of the values and the sums
                for(int counter = 0; counter < 36000; counter++){
                    radomdice1 = (int)(Math.random() * 6 + 1);
                    radomdice2 = (int)(Math.random() * 6 + 1);

                    dice[radomdice1 - 1][radomdice2 - 1]++;
                    dicetotals[radomdice1 + radomdice2]++;
                }

                System.out.print("\t\t\t Table1\n");
                System.out.print("\t 1\t 2\t 3\t 4\t 5\t 6\n");

                for(int row = 0; row < 6; row++){
                    System.out.print((row + 1) + "\t");
                    for(int col = 0; col < 6; col++){
                        System.out.print(dice[row][col]);
                        System.out.print("\t");
                    }
                    System.out.print("\n");
                }

                
                System.out.println("tabular format of the sum:");
                System.out.print("\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t 9\t 10\t 11\t 12");
                System.out.println("\n\t-------------------------------------------------------------------------------------\t");
                for(int count = 2; count < dicetotals.length; count++){
                    System.out.print("\t"+ dicetotals[count]);
                }
            }

        }

        
    }
}
