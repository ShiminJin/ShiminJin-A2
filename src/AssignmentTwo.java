public class AssignmentTwo {
    public static void main(String[] args) {
        //AssignmentTwo part3 = new AssignmentTwo();
        //part3.partThree();
        //AssignmentTwo part4A = new AssignmentTwo();
        //part4A.partFourA();       
        //AssignmentTwo part4B = new AssignmentTwo();
        //part4B.partFourB();
        //AssignmentTwo part5 = new AssignmentTwo();
        //part5.partFive();
        AssignmentTwo part6 = new AssignmentTwo();
        part6.partSix();
    }
    public void partThree(){
        Ride ride = new Ride("rollerCoaster", "RC001", null,2,0);
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
        ride.removeVisitorFromQueue();
        System.out.println("\nWaiting queue after removing a visitor:");
        ride.printQueue();
        
    }
    public void partFourA(){
        Ride ride = new Ride("rollerCoaster", "RC001", null,2,0);
        Visitor visitor1 = new Visitor("Jack","001","123-1111-1234",1,18);
        Visitor visitor2 = new Visitor("Tom", "002","123-2222-1234",2,20);
        Visitor visitor3 = new Visitor("Bob", "003","123-3333-1234",3,17);
        Visitor visitor4 = new Visitor("Steve", "004","123-4444-1234",4,19);
        Visitor visitor5 = new Visitor("Alex", "005","123-5555-1234",5,21); 
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);
    
        ride.checkVisitorFromHistory("Tom");
        ride.numberOfVisitors();
        ride.printRideHistory();



    }
    public void partFourB(){
        Ride ride = new Ride("rollerCoaster", "RC001", null,2,0);
        Visitor visitor1 = new Visitor("Jack","001","123-1111-1234",1,18);
        Visitor visitor2 = new Visitor("Tom", "002","123-2222-1234",2,20);
        Visitor visitor3 = new Visitor("Bob", "003","123-3333-1234",3,17);
        Visitor visitor4 = new Visitor("Steve", "004","123-4444-1234",4,19);
        Visitor visitor5 = new Visitor("Alex", "005","123-5555-1234",5,21); 
        Visitor visitor6 = new Visitor("Blex", "006","123-6666-1234",6,21); 

        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor6);
        ride.addVisitorToHistory(visitor5);
        ride.sortCompletedVisitors();
        ride.printRideHistory();

    }
    public void partFive(){
        Employee employee1 = new Employee("Niki","011","123-0987-1234",1,"rollerCoaster");
        Ride ride = new Ride("rollerCoaster", "RC001",employee1,2,0);
        Visitor visitor1 = new Visitor("Jack","001","123-1111-1234",1,18);
        Visitor visitor2 = new Visitor("Tom", "002","123-2222-1234",2,20);
        Visitor visitor3 = new Visitor("Bob", "003","123-3333-1234",3,17);
        Visitor visitor4 = new Visitor("Steve", "004","123-4444-1234",4,19);
        Visitor visitor5 = new Visitor("Alex", "005","123-5555-1234",5,21); 
        Visitor visitor6 = new Visitor("Blex", "006","123-6666-1234",6,21); 
        Visitor visitor7 = new Visitor("Ross", "007","123-7777-1234",7,22); 
        Visitor visitor8 = new Visitor("Gloria", "008","123-7777-1234",8,23); 
        Visitor visitor9 = new Visitor("Whitney", "009","123-7777-1234",9,19); 
        Visitor visitor10 = new Visitor("Lily", "010","123-7777-1234",10,28); 
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);
        ride.printQueue();
        ride.runOneCycle();
        ride.printQueue();
        ride.sortCompletedVisitors();
        ride.printRideHistory();
    }
    public void partSix(){
        Ride ride = new Ride("rollerCoaster", "RC001", null,2,0);
        Visitor visitor1 = new Visitor("Jack","001","123-1111-1234",1,18);
        Visitor visitor2 = new Visitor("Tom", "002","123-2222-1234",2,20);
        Visitor visitor3 = new Visitor("Bob", "003","123-3333-1234",3,17);
        Visitor visitor4 = new Visitor("Steve", "004","123-4444-1234",4,19);
        Visitor visitor5 = new Visitor("Alex", "005","123-5555-1234",5,21); 
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);
        ride.sortCompletedVisitors();
        ride.exportRideHistory("RideHistory");
    }
    public void partSeven(){
    }
}