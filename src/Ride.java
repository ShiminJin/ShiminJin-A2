import java.util.Queue;
import java.util.LinkedList;

public class Ride implements RideInterface{
    protected String name;
    protected String id;
    protected Employee employee;
    private Queue<Visitor> waitingLine = new LinkedList<>();
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

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
        System.out.println(visitor.getName() + " has been added to the waiting queue");
    }
    @Override
    public Visitor removeVisitorFromQueue() {
        // 移除并返回队列头部的游客（如果存在）
        Visitor visitor = waitingLine.poll();
        if (visitor != null) {
            System.out.println("已从等待队列中移除 " + visitor.getName());
        } else {
            System.out.println("没有游客在等待队列中。");
        }
        return visitor;
    }
    @Override
    public void printQueue() {
        System.out.println("当前等待队列中的游客有：");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor);
        }
        } 
}
