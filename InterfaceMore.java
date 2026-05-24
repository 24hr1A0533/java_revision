interface Apple{
    void show();
    void display();
}
interface Banana extends Apple{
    void cost();
}
class Grapes implements Apple,Banana{

    public void show() {
        System.out.println("Grapes apple show");
    }
    public void display() {
        System.out.println("Grapes apple  display");
    }
    public void cost() {
        System.out.println("Grapes apple 120000");
    }
}
public class InterfaceMore {
    public static void main(String[] args) {
        Banana apple = new Grapes();
        apple.cost();

    }
}
