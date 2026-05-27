class Test3 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("india");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Test4 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Andhra Pradesh");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Test5 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Kerala");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[]args){
        Test3 obj1 = new Test3();
        Test4 obj2 = new Test4();
        Test5 obj3 = new Test5();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.NORM_PRIORITY);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        System.out.println(obj3.getPriority());
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
