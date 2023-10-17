class Mypoint{
    double x;
    double y;

   Mypoint() {
       this(0, 0);
   }


  Mypoint(double x, double y) {
       this.x = x;
       this.y = y;
   }

   double getx(){
       return x;
   }

   void setX(double x){
       this.x = x;
   } 

   double gety(){
       return y;
   }

   void setY(double y){
       this.y = y;
   }


   double distance(double a, double b){
       return Math.sqrt((this.x - a) * (this.x-a) + (this.y - b) * (this.y - b));
   }
}


    
