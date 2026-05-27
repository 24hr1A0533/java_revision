/*class  Test6 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Bangalore");
        }
    }
}
class  Test7 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Amaravathi");
        }
    }
}*/
public class RunnableThread {
    public static void main(String[] args) {
        Runnable obj1 = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Bangalore");
            }
        };
        Runnable obj2 = ()-> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Amaravathi");
                }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
