import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Ride implements RideInterface{
    protected String name;
    protected String id;
    protected Employee employee;
    private Queue<Visitor> waitingLine = new LinkedList<>();
    private LinkedList<Visitor> completedCollection = new LinkedList<>();
    private int maxRider;
    private int numOfCycles;

    public Ride() {
        name = "Unknown";
        id = "000000";
        employee = null;
        maxRider = 1;
        numOfCycles = 0;
    }

    public Ride(String name, String id, Employee employee,int maxRider,int numOfCycles) {
        this.name = name;
        this.id = id;
        this.employee = employee;
        this.maxRider = maxRider;
        this.numOfCycles = 0;
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
    public void sortCompletedVisitors() {
        // Converting a LinkedList to a List for use with Collections.sort
        List<Visitor> visitorsList = new LinkedList<>(completedCollection);
        // Sort using a custom comparator
        Collections.sort(visitorsList, new VisitorComparator());

        // Empty the original completedVisitors and repopulate the sorted list.
        completedCollection.clear();
        completedCollection.addAll(visitorsList);

        System.out.println("Completed visitors have been sorted.");
    }
    @Override
    public void runOneCycle() {
        // Check for assigned employees
        if (employee == null) {
            System.out.println("Cannot run the ride without an assigned employee.");
            return;
        }

        // Check if there are enough visitors in the queue
        if (waitingLine.isEmpty()) {
            System.out.println("Cannot run the ride because there are no visitors in the queue.");
            return;
        }

        // Calculate the actual number of visitors to be removed (not exceeding maxRider)
        int ridersToRemove = Math.min(maxRider, waitingLine.size());

        // Remove and process these visitors
        for (int i = 0; i < ridersToRemove; i++) {
            Visitor visitor = waitingLine.poll();
            if (visitor != null) {
                addVisitorToHistory(visitor);
            }
        }

        // Increased number of runs
        numOfCycles++;
        System.out.println("Ride cycle completed. Total cycles: " + numOfCycles);
    }

    public void exportRideHistory(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName+".csv"))) {
            // Write to CSV header row
            writer.println("Name,id,phoneNum,vid,age");

            // Iterate through the completed visitors and write their information to a file
            for (Visitor visitor : completedCollection) {
                writer.printf("%s,%s,%s,%d,%d%n", visitor.getName(), visitor.getId(), visitor.getPhoneNum(), visitor.getvid(),visitor.getAge());
            }

            System.out.println("Ride history exported to " + fileName + ".csv");
        } catch (IOException e) {
            System.err.println("Error exporting ride history: " + e.getMessage());
        }
    }

    public void importRideHistory(String fileName) {
    try (Scanner scanner = new Scanner(new File(fileName))) {
        scanner.nextLine(); // Skip the header row

        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split(",");
            if (parts.length == 5) {
                try {
                    Visitor visitor = new Visitor(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]),Integer.parseInt(parts[4]));
                    completedCollection.add(visitor);
                } catch (NumberFormatException e) {

                }
            }
        }
    } catch (FileNotFoundException e) {
    } catch (IOException e) {

    }
}

}
