/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/07/2022
 * Assignment Analyze scores
 * 
 * Description: This program will prompt a user to enter the number of scores and Enter the numbers. Then it will display the 
 * average of the value and show the results of the above, equal, and below of the average. 
 */

public class AnalyzeScores {
    public static void main(String[] args) throws Exception {
  
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of scores: ");
        int n = input.nextInt(); 
        double[] scores = new double[n]; // Create an array
        double sum = 0;
          
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextDouble();
            sum += scores[i];
        }
              
            double average =  sum / n;
            System.out.println("Average is " + average);
            int above = 0;
            int below = 0;
            int equal = 0; // The numbers of elements above average
        for (int i = 0; i < n; i++) 
            if (scores[i] > average){ // Count if number[i] > average
                above++;
           
            }else if (scores[i] < average){
                below++;
                
            }else
                equal++;
                
        System.out.println("Number of scores above the average is " + above);
        System.out.println("Number of scores equal the average is " + equal);
        System.out.println("Number of scores below the average is " + below);

    input.close();  
    }
}
