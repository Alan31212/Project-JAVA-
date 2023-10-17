public class Employee extends Person{
    
    private double salary;
    private String hired;
    private String office;

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getoffice(){
        return office;
    }

    public void setoffice(String office){
        this.office = office;
    }

    public String getHired(){
        return hired;
    }

    public void setHired(String hired){
        this.hired = hired;
    }

    public String toString(){
        return super.toString() + " Employee " + "office " + office + ", salary: " + salary + ", hired= " + hired;
    }
}
