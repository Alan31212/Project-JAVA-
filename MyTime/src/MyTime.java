/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/25/2022
 * Assignment The Time class
 * 
 * Description: This program will construct the hour, minute, and second data fields. Then it will  
 * present the elapsed time 555550000 mikkiseconds to the hour, minute, and second and show the result. 
 */

public class MyTime {
    public static void main(String[] args) throws Exception {
        
        Time Time1 = new Time();

        System.out.println(Time1.getHour() + ":" +
                Time1.getMinute() + ":" + Time1.getSecond());
        
        Time Time2 = new Time(555550000);

        System.out.println(Time2.getHour() + ":" + Time2.getMinute() 
                + ":" + Time2.getSecond());
    }
}
