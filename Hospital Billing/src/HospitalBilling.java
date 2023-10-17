/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/04/2022
 * Assignment Hospital Billing
 * 
 * Description: This program will divided patient’s healthcare, there are two of healthcare, inpatient and outpatient. In this program, a user will enter the type of healthcare, 
 * then insert the value and show the result of the amount. 
 * 
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class HospitalBilling {
    
    static Scanner input = new Scanner(System.in);
       
    public static void patient() {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.println("1 to inpatient || 2 to outpatient");
            System.out.print("Press the types of your healthcare: ");
            int choice = input.nextInt();
        if(choice==1){
            System.out.print("The number of days spent in the hospital: ");
            int days = input.nextInt();
            System.out.print("The daily rate: ");
            double rate = input.nextDouble();
            System.out.print("Hospital medication charges: ");
            double charges = input.nextDouble();
            System.out.print("Charges for Hospital Services(lab tests, etc): ");
            double services = input.nextDouble();
       
            System.out.println(
                "\n|\t\t Billing  \t\t|\n" +
                "-----------------------------------------" );
            System.out.println("|" + "days: " + days + "\t\t\t\t|");
            System.out.println("|" + "Daily rate: " + rate + "\t\t\t|");
            System.out.println("|" + "Hospital medication charges: " + "$" + charges + "\t|");
            System.out.println("|" + "Hospital Services: " + "$" + services + "\t\t|"); 
            System.out.print("|" + "Total amount: " + "$" + decimalFormat.format((days * rate) + charges + services) + "\t\t\t|");

        }else if(choice==2){
            System.out.print("Hospital medication charges: ");
            double charges2 = input.nextDouble();
            System.out.print("Charges for Hospital Services(lab tests, etc): ");
            double services2 = input.nextDouble();

            System.out.println(
                "\n|\t\t Billing  \t\t|\n" +
                "-----------------------------------------" );
            System.out.println("|" + "Hospital medication charges: " + "$" + charges2 + "\t|");
            System.out.println("|" + "Hospital Services: " + "$" + services2 + "\t\t|"); 
            System.out.print("|" + "Total amount: " + "$" + decimalFormat.format(charges2 + services2) + "\t\t\t|");
        }
    }
    
     public static void main(String[] args) throws Exception {
        patient();
    }           
}


 
    

