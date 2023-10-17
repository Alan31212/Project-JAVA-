/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/11/2022
 * Assignment ExecutionTime
 * 
 * Description: This program will generate an array of 500,000, and the user enter a key,
 * then it will estimate the execution time of invoking linerSearch and binarysearch methods, then shows the result. 
 */

import java.util.Scanner;
import java.util.Arrays;


public class ExecutionTime {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search key: ");
        int key = input.nextInt(); 
        int[] a = new int[500000];
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 500000);
        }
        linearSearch(a, key);
        binarySearch(a, key);
    }    

    public static void linearSearch(int[] list, int key) {
        long startTime = System.currentTimeMillis();        
        for (int j = 0; j < list.length; j++) {
            if (key == list[j]){
                System.out.println("The key, " + key + ", was found at index " + j + ".");        
            } else{
                System.out.println("The key, " + key + ", was not found ");
                break;
        }   
    }
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.print("Linear search execution time: " + executionTime + " milliseconds.");
    }
    
    public static void binarySearch(int[] list, int key) {
        Arrays.sort(list);
        long startTime = System.currentTimeMillis(); 
        int low = 0;
        int high = list.length - 1;

        String line = System.lineSeparator();  
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid]){
            System.out.println(line + "The key, " + key + ", was found at index " + mid + ".");
                break;
            }else {
              low = mid + 1;
            }
        }
        if (high < low){
        System.out.println(line + "The key value, " + key + ", was not found.");
        }
       
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.print("Binary search execution time: " + executionTime + " milliseconds.");
        return;
    }
}
