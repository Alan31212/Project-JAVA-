/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     10/20/2022
 * Assignment The Rectangle class
 * 
 * Description: This program will create two class, one for caculateRectangle, another for rectangle. Then it will  
 * caculate the Area and perimeter values and show the result. 
 */

public class CaculateRectangle{
    public static void main(String[] args) {

        
    //create a rectangle with width 4 and height 40
    Rectangle r1 = new Rectangle(4, 40);  
    System.out.println("The area of the rectangle of the width " + r1.width +
    "and the height " + r1.height + " is " + r1.getArea() + " and the perimeter is " + r1.getPerimeter());

    //create a rectangle with height 3.5 and height 35.9
    Rectangle r2 = new Rectangle(3.5, 35.9);
    System.out.println("The area of the rectangle of the width " + r2.width + 
    "and the height " + r2.height + " is " + r2.getArea() + " and the perimeter is " + r2.getPerimeter());
    }
}

class Rectangle{
    double width;
    double height;

    Rectangle(){
        height = 1;
        width = 1;
    }
  
    //Rectangle object
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    //return Area
    double getArea() {
        return width * height;
    }

    //return Perimeter
    double getPerimeter() {
        return (width + height) * 2;
        }
}
   


