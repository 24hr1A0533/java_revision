class AB {
    public void show() {
        System.out.println("AB");
    }
}
class BA extends AB {
    public void show1() {
        System.out.println("C");
    }
}
public class DownCastingUpCasting {
    public static void main(String[] args) {
        AB obj =new BA();
        obj.show();

        BA obj1= (BA)obj;
        obj1.show1();
    }
}
