public class Employee extends Person{
    private int eid;
    private String position;

    public Employee() {
        super();
        this.eid = 0;
        this.position = "Position";
    }


    public Employee(String name, String id, String phoneNum, int eid, String position) {
        super(name, id, phoneNum); 
        this.eid = eid;
        this.position = position;
    }

    //Getters and Setters
    public int geteid() {
        return eid;
    }

    public void seteid(int eid) {
        this.eid = eid;
    }

    public String getposition() {
        return position;
    }

    public void  setposition(String position) {
        this.position = position;
    }

}