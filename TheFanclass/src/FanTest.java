class Fanclass {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;
    
    public void Fan(){
        speed =SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public void setSpeed(int ns) {
        speed = ns;
    }

    public void turnOn(){
        on = true;
    }

    public void setradius(double nr){
        radius = nr;
    }

    public void setcolor(String nc){
        color = nc;
    }

    public String getSpeed(){
        String s = "";
        switch (speed){
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }

    public boolean ison(){
        return on;
    }

    public void setOn(boolean trueOrFalse){
        on = trueOrFalse;
    }

    public double getradius(){
        return radius;
    }

    public String getcolor(){
        return color;
    }

 //   public String toString(){
 //       if (on == true){
 //           return "\nFan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius + "\n";

//        }
 //       else{
   //         return "\nFan color: " + color + ", radius: " + radius + "\nfan is off\n";
}



public class FanTest{
    public static void main(String[] args) {
    Fanclass fan1 = new Fanclass();
    fan1.setSpeed("FAST");
    fan1.setradius(10.0);
    fan1.setcolor("yellow");
    fan1.setOn(true);
    System.out.println( "\nFan speed: " + fan1.getSpeed() + ", color: " + fan1.getcolor() + ", radius: " + fan1.getradius() + "\n");
        
    Fanclass fan2 = new Fanclass();
    fan2.setSpeed("MEDIUM");
    fan2.setradius(5.0);
    fan2.setcolor("blue");
    fan2.setOn(false);
    System.out.println( "\nFan speed: " + fan2.getSpeed() + ", color: " + fan2.getcolor() + ", radius: " + fan2.getradius() + "\n");    
    }
}


