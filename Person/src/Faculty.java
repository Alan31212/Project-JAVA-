public class Faculty extends Employee{

    private final int ASSISTANT_PROFESSOR = 1;
    private final int ASSOCIATE_PROFESSOR = 2;
    private final int PROFESSOR = 3;
    private String officeHours;
    private int rank = 1;

    public String getofficeHours(){
        return officeHours;
    }

    public void setofficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public int getRank(){
        return rank;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public String toString(){
        return super.toString() + " Faculty " + "hours " + officeHours + ", rank " + rank;
    }
}
