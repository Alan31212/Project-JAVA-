public class Staff extends Employee{

    private final int ASSISTANT = 1;
    private final int OFFICER = 2;
    private final int MANAGER = 3;
    private int title = 1;


    public int getTitle(){
        return title;
    }

    public void setTitle(int title){
        this.title = title;
    }
    public String toString(){
        return super.toString() + " Staff " + "title= " + title;
    }
}
