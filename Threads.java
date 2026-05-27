class Test1 extends Thread{
    public void run(){
        for(int j=0;j<100;j++) {
            System.out.println("jerry");
        }
    }
}
class Test2 extends Thread{
    public void run(){
        for(int j=0;j<100;j++) {
            System.out.println("Navya");
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        t1.start();
        t2.start();
    }
}
