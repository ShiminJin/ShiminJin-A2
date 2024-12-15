public class Person {
    protected String name;
    protected String id;
    protected String phoneNum; 

    public Person() {
        name = "Unknown";
        id = "000000";
        phoneNum = "000-0000-0000";
    }

    public Person(String name, String id, String phoneNum) {
        this.name = name;
        this.id = id;
        this.phoneNum = phoneNum;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}