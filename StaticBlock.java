class Trees{
    int apple;
    int orange;
    static int banana;
    static{
        banana = 100;
        System.out.println("i am from static block");
    }
    {
        apple = 20;
        orange = 30;
        System.out.println("i am from instance  block");
    }
    Trees(){
        System.out.println("i am from constructor");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Trees obj=new Trees();
    }
}
