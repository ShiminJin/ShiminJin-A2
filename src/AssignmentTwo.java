public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
    }
    public void partThree(){
        Ride ride = new Ride("过山车", "GS001", null);
        Visitor visitor1 = new Visitor("Jack","001","123-1111-1234",1,18);
        Visitor visitor2 = new Visitor("Tom", "002","123-2222-1234",2,20);
        Visitor visitor3 = new Visitor("Bob", "003","123-3333-1234",3,17);
        Visitor visitor4 = new Visitor("Steve", "004","123-4444-1234",4,19);
        Visitor visitor5 = new Visitor("Alex", "005","123-5555-1234",5,21);
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        System.out.println("Waiting queue after adding visitors:");
        ride.printQueue();
        System.out.println("\nAttempted removal of a visitor...");
        ride.removeVisitorFromQueue();
        System.out.println("\nWaiting queue after removing a visitor:");
        ride.printQueue();
        
    }
    public void partFourA(){
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}