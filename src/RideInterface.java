public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    Visitor removeVisitorFromQueue();
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(int Visitor);
    void checkVisitorFromHistory(int Visitor);
    void numberOfVisitors(); 
    void printRideHistory();
}
