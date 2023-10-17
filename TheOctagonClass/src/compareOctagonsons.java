/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     11/14/2022
 * Assignment The Octagon class
 * 
 * Description: This program will prompt a user to enter the miles value. Then it will  
 * convert the value to the kilometers value and show the result. 
 */

public class compareOctagonsons{
    public static void main(String[] args) throws CloneNotSupportedException {

        Octagon octagon1 = new Octagon(9);
        
        
        System.out.println("\nOctgon: \nArea: " + octagon1.getArea() + 
                "\nPerimeter: " + octagon1.getPerimeter());

        System.out.println("Cloning Octagon...");
        Octagon octagon2 = (Octagon)octagon1.clone();

        int result = (octagon1.compareTo(octagon2));
        if (result == 1)
            System.out.println("Octagon is gater than its clone.");
        else if (result == -1)
            System.out.println("Octagon is less than its clone.");
        else
            System.out.println("Octagon is equal to its clone.");

    }
}
//https://github.com/jsquared21/Intro-to-Java-Programming/tree/master/Exercise_13/Exercise_13_11

