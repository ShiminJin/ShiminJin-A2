public class Ride {
    protected String name;
    protected String id;
    protected Employee employee;

    public Ride() {
        name = "Unknown";
        id = "000000";
        employee = null;
    }

    public Ride(String name, String id, Employee employee) {
        this.name = name;
        this.id = id;
        this.employee = employee;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public Employee getemployee() {
        return employee;
    }

    public void setDoctor(Employee employee) {
        this.employee = employee;
    }

}