/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     09/19/2022
 * Assignment Process 2 strings
 * 
 * Description: This program will prompt a user to enter the 2 strings value. Then it will  
 * analysis the value and show the result. 
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String fString = input.nextLine();

        System.out.print("Enter the second string: ");
        String sString = input.nextLine();
        
        char last = fString.charAt(fString.length() -1);
        int length = fString.length();
        System.out.println("The length of the first string is " + length + " and its last character is " + last);
    
        char slast = sString.charAt(sString.length() -1);
        int slength = sString.length();
        System.out.println("The length of the second string is " + slength + " and its last character is " + slast);
        
        
    char flast = fString.charAt(fString.length() -1);
         slast = sString.charAt(sString.length() -1);
    int ascii = flast;   
    if (flast == 65 || flast == 69 || flast == 73 || flast == 79 || flast == 85){
        System.out.println("The last character of the first string, " + flast + ", is a vowel");
}   else if ((ascii>=65 && ascii<=90) || (flast>=97 && flast<=122)) {
        System.out.println("The last character of the first string, " + flast + ", is a consonant");
}   else
        System.out.println("The last character of the first string, "+ flast + ", is NOT a valid consonant or a vowel"); 
    
              
    if (slast == 65 || slast == 69 || slast == 73 || slast == 79 || slast == 85){
        System.out.println("The last character of the second string, " + slast + ", is a vowel");
}   else if ((ascii>=65 && ascii<=90) || (slast>=97 && slast<=122)) {
        System.out.println("The last character of the second string, " + slast + ", is a consonant");
}   else 
        System.out.println("The last character of the first string, "+ slast + ", is NOT a valid consonant or a vowel");
    

    if (fString.contains(sString))
        System.out.println("The second string, " + sString + ", is a substring of the first string " + fString);
    else 
        System.out.println("The second string, " + sString + ", is NOT a substring of the first string " + fString);  
                  

    input.close();
    
    }
}
