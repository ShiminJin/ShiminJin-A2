import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Ride implements RideInterface{
    protected String name;
    protected String id;
    protected Employee employee;
    private Queue<Visitor> waitingLine = new LinkedList<>();
    private LinkedList<Visitor> completedCollection = new LinkedList<>();
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
    }
    @Override
    public Visitor removeVisitorFromQueue() {
        Visitor visitor = waitingLine.poll();
        if (visitor != null) {
            System.out.println("Removed from waiting queue: " + visitor.getName());
        } else {
            System.out.println("There are no visitors in the waiting queue.");
        }
        return visitor;
    }
    @Override
    public void printQueue() {
        System.out.println("The current visitors in the waiting queue are:");
        for (Visitor visitor : waitingLine) {
            System.out.println("-");
            visitor.printInfo();
            System.out.println("-");

        }
    } 
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        completedCollection.add(visitor);
    }
    @Override
    public boolean checkVisitorFromHistory(String Visitor) {
        for (Visitor visitor : completedCollection) {
            if (visitor.getName().equals(Visitor)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void numberOfVisitors() {
        System.out.println(completedCollection.size());
    }
    @Override
    public void printRideHistory() {
        Iterator<Visitor> iterator = completedCollection.iterator();
        if (iterator.hasNext()) {
            System.out.println("The visitors who have completed the ride are:");
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println("-");
                visitor.printInfo();
                System.out.println("-");
            }
        } else {
            System.out.println("No visitors have completed the ride yet.");
        }
    }




}
