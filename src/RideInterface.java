public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    Visitor removeVisitorFromQueue();
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor Visitor);
    boolean checkVisitorFromHistory(String Visitor);
    void numberOfVisitors(); 
    void printRideHistory();
}
