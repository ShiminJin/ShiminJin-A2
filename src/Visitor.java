public class Visitor extends Person{
    private int vid;
    private int age;

    public Visitor() {
        super();
        this.vid = 0;
        this.age = 0;
    }


    public Visitor(String name, String id, String phoneNum, int vid, int age) {
        super(name, id, phoneNum); 
        this.vid = vid;
        this.age = age;
    }

    //Getters and Setters
    public int getvid() {
        return vid;
    }

    public void setvid(int vid) {
        this.vid = vid;
    }

    public int getage() {
        return age;
    }

    public void  setage(int age) {
        this.age = age;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("vid: " + this.vid);
        System.out.println("age: " + this.age);
    }


}