public class Student extends Person{

    public static final int FRESHMAN = 1;
    public static final int SOPHMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4; 
    private int status = 1;

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }
    
    public String toString(){
        return super.toString() + " Student " + "status= " + status;
    }
}
