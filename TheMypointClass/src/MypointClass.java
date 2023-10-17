/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/24/2022
 * Assignment The MyPoint class
 * 
 * Description: This program need to separate class, then the class will caculate the point distance and show the result. 
 */

public class MypointClass {
    public static void main(String[] args) {
        Mypoint point1 = new Mypoint();
        System.out.printf("Distance between (" + point1.getx() + " , " + point1.gety() + ") and point (10, 30.5) the distance is: " + point1.distance(10,30.5));
    }   
}
