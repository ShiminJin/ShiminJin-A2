public class AssignmentTwo {
    public static void main(String[] args) {
    }
    public void partThree(){
        
// 假设有一个 Employee 对象，这里仅作示例

        // 创建一个新的 Ride 对象
        // 假设有一个 Employee 对象，这里仅作示例

        // 创建一个新的 Ride 对象
        Ride ride = new Ride("过山车", "GS001", null);

        // 向队列中添加至少5名访客
        Visitor visitor1 = new Visitor("张三", 28);
        Visitor visitor2 = new Visitor("李四", 34);
        Visitor visitor3 = new Visitor("王五", 22);
        Visitor visitor4 = new Visitor("赵六", 19);
        Visitor visitor5 = new Visitor("孙七", 26);

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // 打印当前队列中的所有访客
        System.out.println("添加完游客后的等待队列：");
        ride.printQueue();

        // 从队列中移除一名访客
        System.out.println("\n尝试移除一名游客...");
        ride.removeVisitorFromQueue();

        // 再次打印当前队列中的所有访客
        System.out.println("\n移除一名游客后的等待队列：");
        ride.printQueue();
        
        // 继续移除直到队列为空
        while (ride.removeVisitorFromQueue() != null) {
            // 空操作，仅用于展示移除过程
        }
        
        // 最后再次打印队列以确认其为空
        System.out.println("\n移除所有游客后的等待队列：");
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