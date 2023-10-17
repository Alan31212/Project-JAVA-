/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     11/07/2022
 * Assignment Count characters, words, and lines in a file
 * 
 * Description: This program will prompt The program should prompt the user for the file name and 
 * it will count the number of characters, words, and lines in a file.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Testfile {
    public static void main(String[] args) throws IOException{
        
    BufferedReader reader = null;

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;
    
        System.out.print("Enter the file name: ");
        String fString = new Scanner(System.in).next();

        try{
            reader = new BufferedReader(new FileReader(fString));
            String currentLine = reader.readLine();
        
            while (currentLine != null){
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;

                for (String word : words){
                    characterCount = characterCount + word.length();
                }

            currentLine = reader.readLine();
            }
        

        System.out.println("The file data1.txt has\n" + characterCount + " charaters\n"
                + wordCount + " words\n" + lineCount + " lines");
        }
        finally{
                reader.close();
        }
    }

}
// C:\Users\Alan\Desktop\countreport.txt
