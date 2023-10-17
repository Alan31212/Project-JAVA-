/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/03/2022
 * Assignment pounds and kilograms
 * 
 * Description: This program will  design a table, and caculate the value from pound to the kilogram and kilogram to pound value, 
 * then show the result. 
 */

import java.text.DecimalFormat;

public class poundandkilograms {
  public static void main(String[] args) throws Exception{

      System.out.println(
          "\nKilograms Pounds | Pounds Kilograms\n" +
                "--------------------------------"
      ); 
     
    
      final short size = 100;

    for (int i = 1; i <= size; i++) { 
      DecimalFormat decimalFormat = new DecimalFormat("#.#");
      DecimalFormat decimalFormat1 = new DecimalFormat("#.##");


      String K = String.format("%d", (i * 2)-1);
      String P = String.format("%d", (i*5) + 15);

      double kilogramToPound = (((i * 2)-1)* 2.204);
      double PoundTokilogram = (((i * 5)+ 15) * 0.453);


      System.out.println(
         K + "\t" + decimalFormat.format(kilogramToPound) + "\t | "
          + P + "\t  " + decimalFormat1.format(PoundTokilogram)
      );
    }
  }  
}
    


