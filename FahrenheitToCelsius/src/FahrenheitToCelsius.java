import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) throws Exception {
        //create scanner for keyboard input
        Scanner input = new Scanner(System.in);

        //prompt the user for a degree value
        System.out.print( "Enter a degree in Fahrenheit: ");
        double Fahrenheit = input.nextDouble();

        //convert to celsius and print the result
        double Celsius = (5.0/9) * (Fahrenheit - 32.);
        System.out.print("Fahrenheit " + Fahrenheit + " is " + Celsius + " in Celsius");

        input.close();
    }
}
