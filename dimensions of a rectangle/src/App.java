import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a Length");
       int Length = input.nextInt();

       System.out.print("Enter a Width");
       int Width = input.nextInt();

       int area = (int)(Length * Width);
       int perimeter = (int)((Length + Width)*2); 

       System.out.print(area);

       System.out.print(perimeter);

       input.close();
    }
}
