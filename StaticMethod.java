class Fruits{
    int apple;
    int orange;
    static int banana;
    public static void price(Fruits obj){
        System.out.println(obj.apple+":"+obj.orange+":"+banana);
    }
}
public class StaticMethod {
    public static void main(String[]args){
        Fruits fruits = new Fruits();
        fruits.apple = 20;
        fruits.orange = 30;
        Fruits.banana = 40;
        Fruits.price(fruits);

    }
}
